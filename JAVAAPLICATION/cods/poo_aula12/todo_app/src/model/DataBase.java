package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
	


	
	public static boolean inserir(Tarefa tarefa){
		final String query1 = "INSERT INTO tarefa (nome, descricao) VALUES (?, ?)";
		final String query2 = "INSERT INTO tarefa_categoria id_tarefa, id_categoria) VALUES (?, ?)";
		
		Connection conexao = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		
		try {
			conexao = ConectionFactory.getConnection();
			statement = conexao.prepareStatement(query1, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, tarefa.getNome());
			statement.setString(2, tarefa.getDescricao());
			statement.execute();
			resultSet = statement.getGeneratedKeys();
			while(resultSet.next()) {
				tarefa.setId(resultSet.getInt(1));
			}
			statement.close();
			
			statement = conexao.prepareStatement(query2);
			statement.setInt(1, tarefa.getId());
			for(Categoria categoria: tarefa.getCategorias()) {
				statement.setInt(2, categoria.getId());
				statement.addBatch();
			}
			statement.executeBatch();
			
		}catch (SQLException e){
			e.printStackTrace(); //imprime um rastreamento do erro
			return false;
		} finally {			
			try {
				if(resultSet != null) {
					resultSet.close();
				}
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {					
				e.printStackTrace();
				return false;
			}
		}
		
		return true;
	
	}
	
	public static boolean atualizar(Tarefa tarefa) {
		
		final String query1 = "UPDATE tarefa SET nome = ?, descricao = ? WHERE id = ?";
		final String query2 = "DELETE FROM tarefa_categoria WHERE id_tarefa = ?";
		final String query3 = "INSERT INTO tarefa_categoria id_tarefa, id_categoria) VALUES (?, ?)";
		
		Connection conexao = null;
		PreparedStatement statement = null;
		
		try {
			conexao = ConectionFactory.getConnection();
			statement = conexao.prepareStatement(query1);
			statement.setString(1, tarefa.getNome());
			statement.setString(2, tarefa.getDescricao());
			statement.setInt(3, tarefa.getId());
			statement.execute();
			statement.close();
			
			statement = conexao.prepareStatement(query2);
			statement.setInt(1, tarefa.getId());
			statement.execute();
			statement.close();
			
			statement = conexao.prepareStatement(query3);
			statement.setInt(1, tarefa.getId());
			for(Categoria categoria: tarefa.getCategorias()) {
				statement.setInt(2, categoria.getId());
				statement.addBatch();
			}
			statement.executeBatch();
			
			
		}catch (SQLException e){
			e.printStackTrace(); //imprime um rastreamento do erro
			return false;
		} finally {			
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {					
				e.printStackTrace();
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean remover (Tarefa tarefa) {
		
		final String query1 = "DELETE FROM tarefa WHERE id = ?";
		final String query2 = "DELETE FROM tarefa_categoria WHERE id_tarefa = ?";
		
		Connection conexao = null;
		PreparedStatement statement = null;
		
		try {
			conexao = ConectionFactory.getConnection();
			
			statement = conexao.prepareStatement(query2);
			statement.setInt(1, tarefa.getId());		
			statement.execute();
			statement.close();
			
			statement = conexao.prepareStatement(query1);
			statement.setInt(1, tarefa.getId());		
			statement.execute();
		}catch (SQLException e){
			e.printStackTrace(); //imprime um rastreamento do erro
			return false;
		} finally {			
			try {
				if(statement != null) {
					statement.close();
				}
			} catch (SQLException e) {					
				e.printStackTrace();
				return false;
			}
		}
		
		return true;
	}
	
	public static List<Tarefa> listar() {
		List<Tarefa> tarefas = new ArrayList<>();
		final String query = "SELECT * FROM tarefa ORDER BY id";
		
		Connection conexao = null;
		Statement statement = null;
		ResultSet resultset = null;
		
		try {
		 conexao = ConectionFactory.getConnection();
		 statement = conexao.createStatement();
		 resultset = statement.executeQuery(query);
		 
		 while(resultset.next()) {
			 Tarefa tarefa = new Tarefa();
			 tarefa.setId(resultset.getInt("Id"));
			 tarefa.setNome(resultset.getString("Nome"));
			 tarefa.setDescricao(resultset.getString("Descricao"));
			 
			 List<Categoria> categorias = CategoriaBD.listarSelecionado(tarefa.getId());
			 tarefa.setCategorias(categorias);
			 tarefas.add(tarefa);
		 }
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			try {
				if(resultset != null) {
					resultset.close();
				}
				if(statement != null) {
					statement.close();
				}
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return tarefas;
	}
}//fim da classe DataBase
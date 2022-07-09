package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoriaBD {

	public static List<Categoria> listar(){
		List<Categoria> categorias = new ArrayList<>();
		final String query = "SELECT * FROM categoria ORDER BY nome";
		
		Connection conexao = null;
		Statement statement = null;
		ResultSet resultset = null;
		
		try {
		 conexao = ConectionFactory.getConnection();
		 statement = conexao.createStatement();
		 resultset = statement.executeQuery(query);
		 
		 while(resultset.next()) {
			 Categoria categoria = new Categoria();
			 categoria.setId(resultset.getInt("Id"));
			 categoria.setNome(resultset.getString("Nome"));	 
			 
			 categorias.add(categoria);
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
		
		return categorias;
	}

	public static List<Categoria> listarNaoSelecionado(int idTarefa) {
		
		List<Categoria> categorias = new ArrayList<>();
		final String query = "SELECT c.id, c.nome FROM categoria c WHERE c.id NOT IN (SELECT tc.id_catagoria FROM tarefa_categoria tc WHERE tc.id_tarefa = ?)";
		
		Connection conexao = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		
		try {
		 conexao = ConectionFactory.getConnection();
		 statement = conexao.prepareStatement(query);
		 statement.setInt(1, idTarefa);
		 resultset = statement.executeQuery();
		 
		 while(resultset.next()) {
			 Categoria categoria = new Categoria();
			 categoria.setId(resultset.getInt("Id"));
			 categoria.setNome(resultset.getString("Nome"));	 
			 
			 categorias.add(categoria);
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
		
		return categorias;		
	}
	
public static List<Categoria> listarSelecionado(int idTarefa) {
		
		List<Categoria> categorias = new ArrayList<>();
		final String query = "SELECT c.id, c.nome FROM categoria c JOIN tarefa_categoria tc ON tc.id_catagoria  WHERE tc.id_tarefa = ?";
		
		Connection conexao = null;
		PreparedStatement statement = null;
		ResultSet resultset = null;
		
		try {
		 conexao = ConectionFactory.getConnection();
		 statement = conexao.prepareStatement(query);
		 statement.setInt(1, idTarefa);
		 resultset = statement.executeQuery();
		 
		 while(resultset.next()) {
			 Categoria categoria = new Categoria();
			 categoria.setId(resultset.getInt("Id"));
			 categoria.setNome(resultset.getString("Nome"));	 
			 
			 categorias.add(categoria);
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
		
		return categorias;		
	}
}

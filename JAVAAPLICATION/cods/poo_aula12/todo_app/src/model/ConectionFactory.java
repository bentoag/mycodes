package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
									/*endere�o do local host 
									 	protocolo postgresql
									 	endereco do servidor: local host
									 	porta padr�o: 5432
									 	nome do banco
									 */
	private static final String URL = "jdbc:postgresql://localhost:5432/crud/"; 
	private static final String USER = "postgres";
	private static final String PASS = "blsm4f14";
	
	private static Connection conexao;
	
	private ConectionFactory() {}; //impede de instanciar mais de uma vez (new)
	
	public static Connection getConnection() throws SQLException{
		if (conexao == null) {
			conexao = DriverManager.getConnection(URL, USER, PASS);
		}
		
		return conexao;
	}
	
}//fim da classe ConectionFactory
package br.com.fiap.singleton;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	
	private static ConnectionManager connectionManager;
	
	public ConnectionManager() {
		
	}
	
	public static ConnectionManager getInstance() {
		if (connectionManager == null) {
			connectionManager = new ConnectionManager();
		}
		return connectionManager;
	}
	
	public static Connection getConnection() {
		Connection conexao = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM96683", 
					"240423");
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}


}

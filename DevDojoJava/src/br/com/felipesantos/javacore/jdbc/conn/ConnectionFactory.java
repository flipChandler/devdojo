package br.com.felipesantos.javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
	//interfaces do java.sql = Connection, Statement (alterações do banco), ResultSet(resultado de uma consulta)
	// conexao através da classe DriverManager 
	
	public static Connection getConnection() {		
        
        String url="jdbc:mysql://localhost:3306/agencia?useSSL=false&useTimezone=true&serverTimezone=UTC";
        String user="root";
        String password="root";
        
        try{        
        	Connection connection = DriverManager.getConnection(url, user, password);
        	return connection;
        }          
        catch(SQLException e) {                
        	System.out.println(e);
            System.out.println("Erro de conexão");
            return null;            
        }		
		
	}
	
	public static void closeConnection(Connection connection) {
		try {
			if (connection != null) {
				connection.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//fechar o statement -> que altera o BD
	public static void closeConnection(Connection connection, Statement stmt) {
		closeConnection(connection);
		
		try {
			if (stmt != null) {
				stmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}	
		
}

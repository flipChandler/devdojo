package br.com.felipesantos.javacore.jdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	//interfaces do java.sql = Connection, Statement (alterações do banco), ResultSet(resultado de uma consulta)
	// conexao através da classe DriverManager 
	
	public Connection getConnection() {		
        
        String url="jdbc:mysql://localhost:3306/agencia?useTimezone=true&serverTimezone=UTC";
        String user="root";
        String password="root";
        
        try{        
        	Connection connection = DriverManager.getConnection(url, user, password);
        	System.out.println("Conexão realizada com sucesso");
        	return connection;
        }          
        catch(SQLException e) {                
        	System.out.println(e);
            System.out.println("Erro de conexão");
            return null;            
        }		
		
	}	
		
}

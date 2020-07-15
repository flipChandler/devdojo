package br.com.felipesantos.javacore.jdbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.felipesantos.javacore.jdbc.conn.ConnectionFactory;

public class CompradorDB {
	
	public void save() {
		String sql = "INSERT INTO comprador (`cpf`, `nome`) VALUES ('321.654.987-00', 'Jason Momoa')";
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			Statement stmt = connection.createStatement();
			System.out.println(stmt.executeUpdate(sql)); 
			ConnectionFactory.closeConnection(connection, stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

	//1) a string sql 
	//2) ter a conexao
	//3) statement -> que trabalha a string sql no banco de dados
	//executeUpdate sempre pra alterações no BD - insert, update e delete
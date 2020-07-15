package br.com.felipesantos.javacore.jdbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.conn.ConnectionFactory;

public class CompradorDB {
	
	public static void save(Comprador comprador) {
		String sql = "INSERT INTO comprador (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getNome() +"')";
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(sql); 
			ConnectionFactory.closeConnection(connection, stmt);
			System.out.println("Registro inserido com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void delete(Comprador comprador) {
		if (comprador == null || comprador.getId() == null) {
			System.out.println("N�o foi poss�vel excluir o registro!");
			return;
		}		
		
		String sql = "DELETE FROM comprador WHERE `id`= '" + comprador.getId() +"'";
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(sql); 
			ConnectionFactory.closeConnection(connection, stmt);
			System.out.println("Registro exclu�do com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// atualiza, por�m, se o id n�o existir, o m�todo n�o reporta o erro
	public static void update(Comprador comprador) {
		if (comprador == null || comprador.getId() == null) {
			System.out.println("N�o foi poss�vel atualizar o registro!");
			return;
		}		
		
		String sql = "UPDATE comprador SET  `cpf`= '" + comprador.getCpf() +"', `nome`='" +comprador.getNome()+"' WHERE `id`='" +comprador.getId() +"'" ;
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(sql); 
			ConnectionFactory.closeConnection(connection, stmt);
			System.out.println("Registro atualizado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

	//1) a string sql 
	//2) ter a conexao
	//3) statement -> que trabalha a string sql no banco de dados
	//executeUpdate sempre pra altera��es no BD - insert, update e delete
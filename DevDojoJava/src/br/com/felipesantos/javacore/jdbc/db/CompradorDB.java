package br.com.felipesantos.javacore.jdbc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
			System.out.println("Não foi possível excluir o registro!");
			return;
		}		
		
		String sql = "DELETE FROM comprador WHERE `id`= '" + comprador.getId() +"'";
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			Statement stmt = connection.createStatement();
			stmt.executeUpdate(sql); 
			ConnectionFactory.closeConnection(connection, stmt);
			System.out.println("Registro excluído com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// atualiza, porém, se o id não existir, o método não reporta o erro
	public static void update(Comprador comprador) {
		if (comprador == null || comprador.getId() == null) {
			System.out.println("Não foi possível atualizar o registro!");
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
	
	public static List<Comprador> selectAll() {
		String sql = "SELECT id, nome, cpf FROM comprador";
		Connection connection = ConnectionFactory.getConnection();
		List<Comprador> compradorList = new ArrayList<>();
		
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
			}
			ConnectionFactory.closeConnection(connection, stmt, rs);
			return compradorList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<Comprador> findByName(String nome) {
		String sql = "SELECT id, nome, cpf FROM comprador where nome like '%" + nome + "%'";
		Connection connection = ConnectionFactory.getConnection();
		List<Comprador> compradorList = new ArrayList<>();
		
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
			}
			ConnectionFactory.closeConnection(connection, stmt, rs);
			return compradorList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

	//1) a string sql 
	//2) ter a conexao
	//3) statement -> que trabalha a string sql no banco de dados
	//executeUpdate sempre pra alterações no BD - insert, update e delete
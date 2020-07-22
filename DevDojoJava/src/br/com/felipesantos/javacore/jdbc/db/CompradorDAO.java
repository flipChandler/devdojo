package br.com.felipesantos.javacore.jdbc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.conn.ConnectionFactory;

public class CompradorDAO {

	public static void save(Comprador comprador) {
		String sql = "INSERT INTO comprador (`cpf`, `nome`) VALUES (?, ?)";			

		try (Connection connection = ConnectionFactory.getConnection(); // try-resources ñ precisa do connection.close()
				PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setString(1, comprador.getCpf());
			ps.setString(2, comprador.getNome());			
			ps.executeUpdate();
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

		String sql = "DELETE FROM comprador WHERE `id`= ?";

		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setInt(1, comprador.getId());
			ps.executeUpdate();			
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

		String sql = "UPDATE comprador SET `cpf`= ?, `nome`= ? WHERE `id`= ? ";		

		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setString(1, comprador.getCpf());
			ps.setString(2, comprador.getNome());
			ps.setInt(3, comprador.getId());

			ps.executeUpdate();

			System.out.println("Registro atualizado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Comprador> selectAll() {
		String sql = "SELECT id, nome, cpf FROM comprador";

		List<Comprador> compradorList = new ArrayList<>();

		try(Connection connection = ConnectionFactory.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while(rs.next()) {
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
			}
			return compradorList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Comprador> findByName(String nome) {
		String sql = "SELECT id, nome, cpf FROM comprador where nome like ?";
		
		List<Comprador> compradorList = new ArrayList<>();

		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			
			ps.setString(1, "%" + nome + "%");			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
			}
			ConnectionFactory.closeConnection(connection, ps, rs);
			return compradorList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


}

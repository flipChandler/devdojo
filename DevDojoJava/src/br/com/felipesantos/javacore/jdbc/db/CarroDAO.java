package br.com.felipesantos.javacore.jdbc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.felipesantos.javacore.jdbc.classes.Carro;
import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.conn.ConnectionFactory;

public class CarroDAO {
	
	public static void save(Carro carro) {
		String sql = "INSERT INTO carro (`nome`, `placa`, `comprador_id`) VALUES (?, ?, ?)";			

		try (Connection connection = ConnectionFactory.getConnection(); // try-resources ñ precisa do connection.close()
				PreparedStatement ps = connection.prepareStatement(sql)) {			
			ps.setString(1, carro.getNome());
			ps.setString(2, carro.getPlaca());						
			ps.setInt(3, carro.getComprador().getId());			
			ps.executeUpdate();
			System.out.println("Registro inserido com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void delete(Carro carro) {
		if (carro == null || carro.getId() == null) {
			System.out.println("Não foi possível excluir o registro!");
			return;
		}		

		String sql = "DELETE FROM carro WHERE `id`= ?";

		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {

			ps.setInt(1, carro.getId());
			ps.executeUpdate();			
			System.out.println("Registro excluído com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// atualiza, porém, se o id não existir, o método não reporta o erro
	public static void update(Carro carro) {
		if (carro == null || carro.getId() == null) {
			System.out.println("Não foi possível atualizar o registro!");
			return;
		}		

		String sql = "UPDATE carro SET `nome`= ?, `placa`= ? WHERE `id`= ? ";		

		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setString(1, carro.getNome());
			ps.setString(2, carro.getPlaca());			
			ps.setInt(3, carro.getId());

			ps.executeUpdate();

			System.out.println("Registro atualizado com sucesso");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static List<Carro> selectAll() {
		String sql = "SELECT id, nome, placa, comprador_id FROM carro";

		List<Carro> carroList = new ArrayList<>();

		try(Connection connection = ConnectionFactory.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while(rs.next()) {
				Comprador compradorId = CompradorDAO.findById(rs.getInt("comprador_id"));				
				carroList.add(new Carro(rs.getInt("id"), rs.getString("nome"), rs.getString("placa"), compradorId));
			}
			return carroList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Carro> findByName(String nome) {
		String sql = "SELECT id, nome, placa, comprador_id FROM carro where nome like ?";
		
		List<Carro> carroList = new ArrayList<>();

		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			
			ps.setString(1, "%" + nome + "%");			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Comprador compradorId = CompradorDAO.findById(rs.getInt("comprador_id"));
				carroList.add(new Carro(rs.getInt("id"), rs.getString("nome"), rs.getString("placa"), compradorId));
			}
			ConnectionFactory.closeConnection(connection, ps, rs);
			return carroList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Carro findById(Integer id) {
		String sql = "SELECT id, nome, placa, comprador_id FROM carro where id = ?";
		
		Carro carro = null;
		
		try (Connection connection = ConnectionFactory.getConnection();
				PreparedStatement ps = connection.prepareStatement(sql)) {
			
			ps.setInt(1, id);			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {	
				Comprador compradorId = CompradorDAO.findById(rs.getInt("comprador_id"));
				carro = new Carro(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), compradorId);
			}
			ConnectionFactory.closeConnection(connection, ps, rs);
			return carro;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


}

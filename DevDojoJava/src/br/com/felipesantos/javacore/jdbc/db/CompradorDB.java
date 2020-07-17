package br.com.felipesantos.javacore.jdbc.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
	
	public static void updatePreparedStatement(Comprador comprador) {
		if (comprador == null || comprador.getId() == null) {
			System.out.println("Não foi possível atualizar o registro!");
			return;
		}		
		
		String sql = "UPDATE comprador SET  `cpf`= ?, `nome`= ? WHERE `id`= ?" ;
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			// prepara a string sql
			PreparedStatement ps = connection.prepareStatement(sql);
			//lança os parametros recuperados do objeto
			ps.setString(1, comprador.getCpf());
			ps.setString(2, comprador.getNome());
			ps.setInt(3, comprador.getId());
			
			// executa a query finalmente
			ps.executeUpdate(); 
			
			ConnectionFactory.closeConnection(connection, ps);
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
	
	// utiliza a stored procedure SP_GetCompradoresPorNome criada no banco de dados
	public static List<Comprador> findByNameCallableStatement(String nome) {
		String sql = "CALL SP_GetCompradoresPorNome( ? )";
		Connection connection = ConnectionFactory.getConnection();
		List<Comprador> compradorList = new ArrayList<>();
		
		try {
			CallableStatement cs = connection.prepareCall(sql);
			cs.setString(1, "%" + nome + "%");
			ResultSet rs = cs.executeQuery();
			while(rs.next()) {
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
			}
			ConnectionFactory.closeConnection(connection, cs, rs);
			return compradorList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static List<Comprador> findByNameSQLInjection(String nome) {
		String sql = "SELECT id, nome, cpf FROM comprador where nome like '" + nome + "'";
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
	
	public static List<Comprador> findByNamePreparedStatement(String nome) {
		String sql = "SELECT id, nome, cpf FROM comprador where nome like ?";
		Connection connection = ConnectionFactory.getConnection();
		List<Comprador> compradorList = new ArrayList<>();
		
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
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
	
	public static void selectMetadata() {
		String sql = "SELECT * FROM comprador";
		Connection connection = ConnectionFactory.getConnection();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			rs.next();
			int qtdeColunas = rsmd.getColumnCount();
			System.out.println("Quantidade colunas: " + qtdeColunas);
			for (int i = 1; i <= qtdeColunas; i++) {
				System.out.println("Tabela: " + rsmd.getTableName(i));
				System.out.println("Nome coluna: " + rsmd.getColumnName(i));
				System.out.println("Tamanho coluna: " + rsmd.getColumnDisplaySize(i));
			}
			
			ConnectionFactory.closeConnection(connection, stmt, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void checkDriverStatus() {
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			DatabaseMetaData dtmd = connection.getMetaData();
			if (dtmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				System.out.println("suporta TYPE_FORWARD_ONLY"); // sentido sempre para frente do ResultSet
				if (dtmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println(" e também suporta CONCUR_UPDATABLE");
				}
			}
			if (dtmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				System.out.println("suporta TYPE_SCROLL_INSENSITIVE"); // sentido sempre para frente do ResultSet
				if (dtmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println(" e também suporta CONCUR_UPDATABLE");
				}
			}
			if (dtmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				System.out.println("suporta TYPE_SCROLL_SENSITIVE"); // sentido sempre para frente do ResultSet
				if (dtmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					System.out.println(" e também suporta CONCUR_UPDATABLE");
				}
			}
			ConnectionFactory.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// exemplos do ResultSet na ultima, primeira linha, achar linha especifica da tabela. linha relativa a linha anterior
	public static void testTypeScrollAll() {// acha a ultima linha da tabela comprador pelo select | se fosse order by nome, seria o ultimo nome
		String sql = "SELECT id, nome, cpf FROM comprador";
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			//sempre passar o parametro insensitive e readonly para não depender do driver do sgbd
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.last()) {// vai p/ ultima linha
				System.out.println("Ultima linha " + new Comprador(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf")));
				System.out.println("Número última linha: " + rs.getRow());
			}
			System.out.println("Retornou para a primeira linha " + rs.first());
			System.out.println("Primeira linha: " + rs.getRow());
			rs.absolute(4);
			System.out.println("Linha 4 " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			rs.relative(-1);// 3
			System.out.println("Linha 3 " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
			System.out.println(rs.isLast());// false
			System.out.println(rs.isAfterLast());// false
			System.out.println(rs.isFirst());// false
			
			rs.afterLast(); // resultSet está depois da última linha agora
			System.out.println("-------------------");
			
			//printa do ultimo para o primeiro
			while(rs.previous()) {// enquanto tiver o anterior, printa | vai printa as linhas da tabela em ordem desc
				System.out.println(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));				
			}
			
			
			
			ConnectionFactory.closeConnection(connection, stmt, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void updateNomesToLowerCase() {
		String sql = "SELECT id, nome, cpf FROM comprador";
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); // atualizar pelo ResultSet
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				rs.updateString("nome", rs.getString("nome").toLowerCase()); // atualize a coluna nome, com o q retornar de rs para LowerCase
				rs.updateRow();// atualiza a linha no banco de dados
			}
			
			rs.beforeFirst();// voltou pro inicio
			while(rs.next()) {// mostrar se a linhas foram atualizadas
				System.out.println(rs.getString("nome"));
			}
			ConnectionFactory.closeConnection(connection, stmt, rs);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	// com Select e resultSet dá pra fazer updates
	public static void testeUpdateNomesToUpperCase() {
		String sql = "SELECT id, nome, cpf FROM comprador";
		Connection connection = ConnectionFactory.getConnection();
		
		
		try {
			DatabaseMetaData dbmd = connection.getMetaData(); // pra não lançar a exceção que a feature de verificar CRUD pelo ResultSet é possivel
			
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(dbmd.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
			System.out.println(dbmd.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
			System.out.println(dbmd.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
			
			if ( rs.next() ) {
				rs.updateString("nome", rs.getString("nome").toUpperCase());
				rs.updateRow();
				//rs.cancelRowUpdate(); // rollback do update da linha
//				if (rs.rowUpdated()) {
//					System.out.println("Linha atualizada");
//				}
			}
			
			rs.absolute(2);// estou na linha 2
			String nome = rs.getString("nome");
			rs.moveToInsertRow();// copiou o nome para uma linha temporaria
			rs.updateString("nome", nome.toUpperCase());//na temporaria, altere a coluna nome para uppercase
			rs.updateString("cpf", "999.999.999-99"); // na temporaria, altere a coluna cpf com os 9's
			rs.insertRow();// insira essa linha temporaria na tabela
			rs.moveToCurrentRow();// vá para linha atual (absoluta)
			System.out.println(rs.getString("nome") + ", linha: " + rs.getRow());
			
			rs.absolute(7);// foi pra linha 7
			rs.deleteRow();// delete-a
			
			ConnectionFactory.closeConnection(connection, stmt, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

	//1) a string sql 
	//2) ter a conexao
	//3) statement -> que trabalha a string sql no banco de dados
	//executeUpdate sempre pra alterações no BD - insert, update e delete
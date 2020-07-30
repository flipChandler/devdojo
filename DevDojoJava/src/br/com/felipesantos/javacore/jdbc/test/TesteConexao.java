package br.com.felipesantos.javacore.jdbc.test;

import java.sql.SQLException;
import java.util.List;

import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.db.CompradorDBOLD;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
//		List<Comprador> listaComprador = selecionarTudo();
//		listaComprador.forEach(lista -> System.out.println(lista));
//		
//		List<Comprador> listaComprador2 = buscarPorNome("Baldini");
//		System.out.println(listaComprador2);
		
		//CompradorDB.checkDriverStatus();
		// suporta TYPE_SCROLL_INSENSITIVE -> Driver do MySQL
		// e também suporta CONCUR_UPDATABLE
		
		//CompradorDB.testTypeScrollAll();
		//CompradorDB.updateNomesToLowerCase();
		//CompradorDB.testeUpdateNomesToUpperCase();
		//System.out.println(CompradorDB.findByNameSQLInjection("oao' or 'X'='X"));//traz todos os dados da tabela comprador
		//System.out.println(CompradorDB.findByNamePreparedStatement("oa"));
		//CompradorDB.updatePreparedStatement(new Comprador(1, "156.369.789-12", "Carmelita da Silva"));
		//System.out.println(CompradorDB.findByNameCallableStatement("oao"));
		//System.out.println(CompradorDB.findByNameRowSet("oao"));
		//CompradorDB.updateRowSet(new Comprador(1, "251.963.154-00", "Wolverine"));
		//CompradorDBOLD.saveTransaction();
		System.out.println(CarroCRUD.listar());
		
	}
	
	public static void inserir() {
		Comprador comprador = new Comprador("159.357.951-41", "Charlie Brown");
		CompradorDBOLD.save(comprador);		
	}
	
	public static void deletar() {
		Comprador comprador = new Comprador();
		comprador.setId(4);
		CompradorDBOLD.delete(comprador);
	}
	
	public static void atualizar() {
		Comprador comprador = new Comprador(6,"000.000.000-00", "Mariana Baldini" );
		CompradorDBOLD.update(comprador);
	}
	
	public static List<Comprador> selecionarTudo() {
		return CompradorDBOLD.selectAll();
	}

	public static List<Comprador> buscarPorNome(String nome) {
		return CompradorDBOLD.findByName(nome);
	}

}

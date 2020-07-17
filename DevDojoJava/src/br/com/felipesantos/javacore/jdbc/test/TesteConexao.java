package br.com.felipesantos.javacore.jdbc.test;

import java.util.List;

import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.db.CompradorDB;

public class TesteConexao {

	public static void main(String[] args) {
//		List<Comprador> listaComprador = selecionarTudo();
//		listaComprador.forEach(lista -> System.out.println(lista));
//		
//		List<Comprador> listaComprador2 = buscarPorNome("Baldini");
//		System.out.println(listaComprador2);
		
		//CompradorDB.checkDriverStatus();
		// suporta TYPE_SCROLL_INSENSITIVE -> Driver do MySQL
		// e também suporta CONCUR_UPDATABLE
		
		CompradorDB.testTypeScrollAll();
		
	}
	
	public static void inserir() {
		Comprador comprador = new Comprador("159.357.951-41", "Charlie Brown");
		CompradorDB.save(comprador);		
	}
	
	public static void deletar() {
		Comprador comprador = new Comprador();
		comprador.setId(4);
		CompradorDB.delete(comprador);
	}
	
	public static void atualizar() {
		Comprador comprador = new Comprador(6,"000.000.000-00", "Mariana Baldini" );
		CompradorDB.update(comprador);
	}
	
	public static List<Comprador> selecionarTudo() {
		return CompradorDB.selectAll();
	}

	public static List<Comprador> buscarPorNome(String nome) {
		return CompradorDB.findByName(nome);
	}

}

package br.com.felipesantos.javacore.jdbc.test;

import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.db.CompradorDB;

public class TesteConexao {

	public static void main(String[] args) {
		atualizar();
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

}

package br.com.felipesantos.javacore.jdbc.test;

import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.db.CompradorDB;

public class TesteConexao {

	public static void main(String[] args) {
		Comprador comprador = new Comprador("159.357.951-41", "Priscila Jordan");
		CompradorDB compradorDB = new CompradorDB();
		compradorDB.save(comprador);

	}

}

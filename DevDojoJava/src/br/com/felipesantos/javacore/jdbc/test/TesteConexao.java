package br.com.felipesantos.javacore.jdbc.test;

import br.com.felipesantos.javacore.jdbc.db.CompradorDB;

public class TesteConexao {

	public static void main(String[] args) {
		//ConnectionFactory.getConnection();
		
		CompradorDB compradorDB = new CompradorDB();
		compradorDB.save();

	}

}

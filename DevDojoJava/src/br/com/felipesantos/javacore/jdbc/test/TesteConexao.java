package br.com.felipesantos.javacore.jdbc.test;

import br.com.felipesantos.javacore.jdbc.conn.ConnectionFactory;

public class TesteConexao {

	public static void main(String[] args) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connectionFactory.getConnection();

	}

}

package br.com.felipesantos.javacore.blocosdeinicializacao.test;

import br.com.felipesantos.javacore.blocosdeinicializacao.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		System.out.println("Exibindo quantidade de parcelas possíveis");
		for (int parcela : cliente.getParcelas()) {
			System.out.print(parcela + " ");
		}

	}

}

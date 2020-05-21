package br.com.felipesantos.javacore.modificadorestatico.test;

import br.com.felipesantos.javacore.modificadorestatico.classes.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		System.out.println("Exibindo quantidade de parcelas possíveis");
//		for (int parcela : cliente.getParcelas()) {
//			System.out.print(parcela + " ");
//		}
		
		System.out.println("Tamanho: " + Cliente.getParcelas().length);

	}

}

package br.com.felipesantos.javacore.enum_.test;

import br.com.felipesantos.javacore.enum_.classes.Cliente;
import br.com.felipesantos.javacore.enum_.classes.TipoCliente;

public class ClienteTest {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Jarbas", TipoCliente.PESSOA_FISICA);
		System.out.println(cliente);

	}

}

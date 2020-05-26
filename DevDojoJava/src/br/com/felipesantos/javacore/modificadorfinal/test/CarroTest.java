package br.com.felipesantos.javacore.modificadorfinal.test;

import br.com.felipesantos.javacore.modificadorfinal.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro carro = new Carro();
		System.out.println(carro.getComprador());
		carro.getComprador().setNome("Marcosa");
		System.out.println(carro.getComprador());
		
		

	}

}

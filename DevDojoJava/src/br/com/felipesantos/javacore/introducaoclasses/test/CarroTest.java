package br.com.felipesantos.javacore.introducaoclasses.test;

import br.com.felipesantos.javacore.introducaoclasses.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Fusca";
		carro.placa = "ESR2345";
		carro.velocidadeMaxima = 120f;
		
		System.out.println(carro.modelo);
		System.out.println(carro.placa);
		System.out.println(carro.velocidadeMaxima);

	}

}

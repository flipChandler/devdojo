package br.com.felipesantos.aula27.introducaometodos.test;

import br.com.felipesantos.aula27.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();
		System.out.println("...Continuando a execução ");

	}

}

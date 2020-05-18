package br.com.felipesantos.aula27.introducaometodos.test;

import br.com.felipesantos.aula27.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();
		calculadora.multiplicaDoisNumeros(5, 10);
		System.out.println(calculadora.divideDoisNumeros(140.0, 2));
		
		double resultadoDivisao = calculadora.divideDoisNumeros(200.70, 2);
		
		System.out.println(resultadoDivisao);
		System.out.println("...Continuando a execução ");

	}

}

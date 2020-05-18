package br.com.felipesantos.aula27.introducaometodos.test;

import br.com.felipesantos.aula27.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		calculadora.somaDoisNumeros(); //10
		calculadora.subtraiDoisNumeros();// 13
		calculadora.multiplicaDoisNumeros(5, 10); // 50
		System.out.println(calculadora.divideDoisNumeros(140.0, 2)); // 70
		
		double resultadoDivisao = calculadora.divideDoisNumeros(200.70, 0);
		
		calculadora.imprimeDoisNumerosDivididos(10, 5); // infinity
		System.out.println(resultadoDivisao); // 0
		System.out.println("...Continuando a execução ");

	}

}

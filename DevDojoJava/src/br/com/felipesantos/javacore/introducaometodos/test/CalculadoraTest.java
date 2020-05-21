package br.com.felipesantos.javacore.introducaometodos.test;

import br.com.felipesantos.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora.somaDoisNumeros(); //10
		Calculadora.subtraiDoisNumeros();// 13
		Calculadora.multiplicaDoisNumeros(5, 10); // 50
		System.out.println(Calculadora.divideDoisNumeros(140.0, 2)); // 70
		
		double resultadoDivisao = Calculadora.divideDoisNumeros(200.70, 0);
		
		Calculadora.imprimeDoisNumerosDivididos(10, 5); // infinity
		System.out.println(resultadoDivisao); // 0
		System.out.println("...Continuando a execução ");

		int[] numeros = {10, 2, 3, 4, 5};// aula 34
		Calculadora.somaArray(numeros);
		
		Calculadora.somaVarArgs("teste", 10, 2, 3, 4, 5);
	}

}

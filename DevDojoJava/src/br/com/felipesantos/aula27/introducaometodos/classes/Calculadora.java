package br.com.felipesantos.aula27.introducaometodos.classes;

public class Calculadora {
	
	public void somaDoisNumeros() {
		System.out.println(5 + 5);
	}
	
	public void subtraiDoisNumeros() {
		System.out.println(15 - 2);
	}
	
	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public double divideDoisNumeros(double num1, double num2) {
		if (num2 != 0) { 
			return num1 / num2;
		}		
		return 0; // pra não dar infinity se for divido por 0
	}
	
	public void imprimeDoisNumerosDivididos(double num1, double num2) {
		if (num2 != 0) {
			System.out.println(num1 / num2);
			return; // é igual o break em metodos void
		}		
		System.out.println("Não é possivel dividir por zero!"); // pra não dar infinity se dividir por zero	
	}
	
	public void alteraDoisNumeros(int num1, int num2) {
		num1 = 30;
		num2 = 40;
		System.out.println("Dentro do alteraDoisNumeros");
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
	}
	
	public void somaArray(int [] numeros) {
		int soma = 0;
		
		for (int num : numeros) {
			soma += num;		
		}
		System.out.println(soma);		
	}
	
	public void somaVarArgs(String nome, int... numeros) {// o parametro do varArgs tem que ser o ultimo
		int soma = 0;
		
		for (int num : numeros) {
			soma += num;		
		}
		System.out.println(soma);
	}
}

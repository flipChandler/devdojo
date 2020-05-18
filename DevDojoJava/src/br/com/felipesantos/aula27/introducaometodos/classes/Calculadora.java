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
}

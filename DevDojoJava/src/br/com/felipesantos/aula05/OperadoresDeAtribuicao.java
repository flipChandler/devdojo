package br.com.felipesantos.aula05;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		// =, -=, +=, *= , /=, %=
		
		int salario = 1000;
		salario /= 2;
		
		salario = 100 + (int) (salario * 0.1); // casting
		
		System.out.println(salario);// 550
		
		int numero = 11;
		
		numero %= 2;
		
		System.out.println(numero);// 1
	}

}

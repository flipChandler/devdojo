package br.com.felipesantos.javacore.regex.test;

public class TokenTest {

	public static void main(String[] args) {
		String str = "Felipe, Suzi, Priscila, Maria, John, Monica";
		String[] tokens = str.split(",");
		
		for(String nome : tokens) {
			System.out.println(nome.trim());
		}

	}

}

package br.com.felipesantos.aula10;

import java.util.Scanner;

public class ControleFluxo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 0;
		String status;

		System.out.println("Digite a sua idade: ");
		idade = scanner.nextInt();

		status = idade >= 18 ? "J� � adulto!" : "Ainda est� nas fraldas!";		
		
		System.out.println(status);
	}
}

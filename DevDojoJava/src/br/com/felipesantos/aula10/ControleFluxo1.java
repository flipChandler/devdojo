package br.com.felipesantos.aula10;

import java.util.Scanner;

public class ControleFluxo1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 0;
		String categoria;

		System.out.println("Digite a sua idade: ");
		idade = scanner.nextInt();

		if (idade < 15) {
			categoria = "Sua categoria � infantil!";
		} else if (idade >= 15 && idade < 18) {
			categoria = "Sua categoria � juvenil!";
		}else {
			categoria = "Sua categoria � adulto!";
		}
		
		System.out.println(categoria);
	}

}

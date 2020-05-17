package aula10;

import java.util.Scanner;

public class ExercicioFluxo {

	public static void main(String[] args) {
		/*
		 * SALARIO < 1000 -> IMPOSTO DE 5%
		 * SALARIO >= 1000 && SALARIO < 2000 -> IMPOSTO DE 10%
		 * SALARIO >= 2000 && SALARIO < 4000 -> IMPOSTO DE 15%
		 * SALARIO >= 4000 -> IMPOSTO DE 20%
		 */
		
		Scanner scanner = new Scanner(System.in);
		double salario, imposto = 0d;
		
		System.out.println("Informe o seu salário: ");
		salario = scanner.nextDouble();
		
		if (salario < 1000) {
			imposto = 5/100d;
		}else if (salario >= 1000 && salario < 2000) {
			imposto = 10/100d;
		}else if ( salario >= 2000 && salario < 4000) {
			imposto = 15/100d;
		}else {
			imposto = 20/100d;
		}
		
		imposto *= salario;
		
		System.out.printf("O seu salário é %.2f e o total de impostos a pagar é %.2f", salario, imposto);
		
		//PAREI NA AULA 11
		
	}

}

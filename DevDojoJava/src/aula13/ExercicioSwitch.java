package aula13;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte dia;
		
		System.out.println("Digite de 1 a 7 para checar se é dia util ou fim de semana");
		dia = scanner.nextByte();
		scanner.close();
		
		switch(dia) {
			case 1:
			case 7:
				System.out.println("É final de semana");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("É dia útil");
				break;
			default:
				System.out.println("Opção inválido");
				break;
				
		}
		
		

	}

}

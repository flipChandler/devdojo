package aula13;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte dia;
		
		System.out.println("Digite de 1 a 7 para checar se � dia util ou fim de semana");
		dia = scanner.nextByte();
		scanner.close();
		
		switch(dia) {
			case 1:
			case 7:
				System.out.println("� final de semana");
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("� dia �til");
				break;
			default:
				System.out.println("Op��o inv�lido");
				break;
				
		}
		
		

	}

}

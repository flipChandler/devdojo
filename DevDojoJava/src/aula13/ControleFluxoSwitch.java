package aula13;

import java.util.Scanner;

public class ControleFluxoSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte diaDaSemana = 0;
		// para switch somente: char, int, byte, short, enum, e String
		
		System.out.println("Digite [1] para domingo");
		System.out.println("Digite [2] para segunda");
		System.out.println("Digite [3] para ter�a");
		System.out.println("Digite [4] para quarta");
		System.out.println("Digite [5] para quinta");
		System.out.println("Digite [6] para sexta");
		System.out.println("Digite [7] para s�bado");
		
		diaDaSemana = scanner.nextByte();
		
		switch( diaDaSemana ) {
			case 1:
				System.out.println("Hoje � domingo");
				break;
			case 2:
				System.out.println("Hoje � segunda");
				break;
			case 3:
				System.out.println("Hoje � ter�a");
				break;
			case 4:
				System.out.println("Hoje � quarta");
				break;
			case 5:
				System.out.println("Hoje � quinta");
				break;
			case 6:
				System.out.println("Hoje � sexta");
				break;
			case 7:
				System.out.println("Hoje � s�bado");
				break;			
		}
		
		
		char sexo = 'F';
		switch(sexo) {
		case 'F':
			System.out.println("Feminino");
			break;
		case 'M':
			System.out.println("Masculino");
			break;
		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		
		
	}
}

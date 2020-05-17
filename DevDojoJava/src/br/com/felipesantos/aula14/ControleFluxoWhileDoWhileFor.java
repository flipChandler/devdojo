package br.com.felipesantos.aula14;

public class ControleFluxoWhileDoWhileFor {

	public static void main(String[] args) {
		int contador = 0;
		
		while(contador < 10) {
			System.out.println(contador++);			
		}
		
		System.out.println("PULA LINHA");
		
		contador = 0;
		do {
			System.out.println(contador++);
		}while(contador < 10);
		
		System.out.println("PULA LINHA");		
		
		for (contador = 0; contador < 10; contador++) {
			System.out.println(contador);
		}
	}

}

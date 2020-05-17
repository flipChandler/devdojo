package br.com.felipesantos.aula18;

import java.util.Random;

public class ArrayMulti {

	public static void main(String[] args) {
		int[][] dias = new int[3][];
		
		dias[0] = new int[2];
		dias[1] = new int[] {2, 4, 5};
		dias[2] = new int[4];
		
		Random random = new Random();
		
		for (int i = 0; i < dias.length; i++) {
			for (int j = 0; j < dias[i].length; j++) {
				dias[i][j] = random.nextInt(101); // GERA UM NUMERO RANDOMICO DE 0 A 100
			}
		}
		
		for(int[] ref : dias) {
			for (int dia : ref) {
				System.out.println(dia);
			}
		}
		
		
		int [][] days = { {32, 4}, {23, 56, 100},{60, 3, 123, 12} };
		
		System.out.println(days[1][2]); // IMPRIME O 100
	}

}

package aula18;

public class ArrayMultiDimensionais {

	public static void main(String[] args) {
		int[][] dias = new int[2][2];
		
		dias[0][0] = 30;
		dias[0][1] = 31;
		dias[1][0] = 29;
		dias[1][1] = 28;
		
		//SE TEMOS UM ARRAY BI-DIMENSIONAL, PRECISAMOS DE 2 FOR'S
		
		for (int i = 0; i < dias.length;i++) {
			for (int j = 0; j < dias[i].length;j++) {
				System.out.println(dias[i][j]);
			}
		}
		
		System.out.println("PULA LINHA");
		
		for (int[] ref : dias) {// REFERENCIA DA MEMORIA DO ARRAY
			for ( int dia : ref) { // PERCORRE A CADA REFERENCIA
				System.out.println(dia);
			}
		}

	}

}

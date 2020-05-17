package aula18;

public class Array1 {

	public static void main(String[] args) {
		
		int [] idades = new int[5];
		
		idades[0] = 40;
		idades[1] = 12;
		idades[2] = 7;
		idades[3] = 100;
		idades[4] = 123;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.printf("O valor na posição %d é %d \n", i, idades[i]);
		}

	}

}

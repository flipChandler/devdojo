package aula18;

public class ArrayForEach {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		int[] numeros2 = {1,2,3,4,5};
		int[] numeros3 = new int[] {1,2,3,4,5};
		
		
		for (int numero : numeros2) {
			System.out.println(numero);
		}
		
		String[] nomes = {"Joca", "Bila", "Zé Lito", "Dunha"};
		
		int cont = 0;
		for (String nome : nomes) {
			System.out.println("O nome na posição " + cont + " é " + nome);
			cont++;
		}

	}

}

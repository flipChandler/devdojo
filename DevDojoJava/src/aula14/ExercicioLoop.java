package aula14;

public class ExercicioLoop {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.printf("O valor de i � %d\n", i);
		}
		
		//IMPRIMA TODOS OS N�MEROS PARES DE 0 AT� 100
		for (int i = 0; i <= 100; i+=2) {
			System.out.println(i);
		}
	}
}

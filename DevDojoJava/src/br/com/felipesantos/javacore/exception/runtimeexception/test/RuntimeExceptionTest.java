package br.com.felipesantos.javacore.exception.runtimeexception.test;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		Object object = null;

//		int a = 10;
//		int b = 0;
//		
//		if (b != 0) {
//			int c = a / b;
//			System.out.println(a); // by zero, um erro em tempo de execução | runtime error coloca um if
//		}
		try {
			int[] a = new int[2];
			System.out.println(a[2]); // ArrayIndexOutOfBoundsException | acessar um indice que não existe
			System.out.println("Imprimindo depois da possivel exceção");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fora do bloco catch"); // a aplicação não para mesmo com a exception lançada

	}
}

package br.com.felipesantos.javacore.exception.runtimeexception.test;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		Object object = null;

//		int a = 10;
//		int b = 0;
//		
//		if (b != 0) {
//			int c = a / b;
//			System.out.println(a); // by zero, um erro em tempo de execu��o | runtime error coloca um if
//		}
		try {
			int[] a = new int[2];
			System.out.println(a[2]); // ArrayIndexOutOfBoundsException | acessar um indice que n�o existe
			System.out.println("Imprimindo depois da possivel exce��o");
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fora do bloco catch"); // a aplica��o n�o para mesmo com a exception lan�ada

	}
}

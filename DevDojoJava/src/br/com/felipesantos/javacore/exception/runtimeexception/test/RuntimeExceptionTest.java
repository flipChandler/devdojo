package br.com.felipesantos.javacore.exception.runtimeexception.test;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		if (b != 0) {
			int c = a / b;
			System.out.println(a); // by zero, um erro em tempo de execução | runtime error coloca um if
		}
	}
}

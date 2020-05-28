package br.com.felipesantos.javacore.exception.error.test;

public class ErrorTest {

	public static void main(String[] args) {
		stackOverflowError();
		
	}
	
	public static void stackOverflowError() {
		stackOverflowError(); // um erro de recursividade | empilhamento metodo chama ele mesmo que chama ele mesmo
		// Exception in thread "main" java.lang.StackOverflowError 
	}

}

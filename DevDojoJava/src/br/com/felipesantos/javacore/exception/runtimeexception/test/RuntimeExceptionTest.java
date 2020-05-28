package br.com.felipesantos.javacore.exception.runtimeexception.test;

import java.util.List;

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
		
		System.out.println(object.toString()); // nullPointerException 
	}
}

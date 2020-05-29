package br.com.felipesantos.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {

	public static void main(String[] args) {
		try {
			throw new IndexOutOfBoundsException();
		} catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {// no Java 7, multi-catch separados pelo PIPE
			System.out.println("dentro do ArrayIndexOutOfBoundsException");
		} 
		System.out.println("Fim do programa!");
		// mais generico por ultimo | tds as exceptions acima descendem de RuntimeException
		
		
		try {
			talvezLanceException();
		} catch (Exception e) { // lança a SQLException e FileNotException q já foram declaradas na assinatura do metodo 
			
		}
		
	}
	
	private static void talvezLanceException(  ) throws SQLException, FileNotFoundException { // tem 2
		
	}

}

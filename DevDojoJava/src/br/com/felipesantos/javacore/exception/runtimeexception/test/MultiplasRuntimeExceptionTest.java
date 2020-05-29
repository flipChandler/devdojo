package br.com.felipesantos.javacore.exception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {

	public static void main(String[] args) {
		try {
			throw new IllegalArgumentException();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("dentro do ArrayIndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("dentro do IndexOutOfBoundsException");
		} catch (IllegalArgumentException e) {
			System.out.println("dentro do IllegalArgumentException");
		} catch (ArithmeticException e) {
			System.out.println("dentro do ArithmeticException");
		} catch (RuntimeException e) {
			System.out.println("dentro do RuntimeException");
		}
		// mais generico por ultimo | tds as exceptions acima descendem de RuntimeException
		
		
		try {
			talvezLanceException();
		} catch (SQLException e) {// capture as duas 
			// TODO: handle exception
		}catch(FileNotFoundException e) {// capture as duas 
			
		}
		
	}
	
	private static void talvezLanceException(  ) throws SQLException, FileNotFoundException { // tem 2
		
	}

}

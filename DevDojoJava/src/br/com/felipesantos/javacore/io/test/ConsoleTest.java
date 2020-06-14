package br.com.felipesantos.javacore.io.test;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		char[] pw = console.readPassword("%s", "pw: ");
		
		for(char password: pw) {
			console.format("%c ", password);
		}
		console.format("\n");
		
		String texto;
		while(true) {
			texto = console.readLine("%s", "Digite: ");
			console.format("esse texto %s foi digitado", retorno(texto));
		}
	}
	
	public static String retorno(String arg) {
		return arg;
	}
	
	

}

package br.com.felipesantos.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// METACARACTERES
		// [] procure esse intervalo de caracteres
		String regex = "[a-eA-B]"; // de a at� e | de A at� B
		String texto = "h\nab1 235 48gAfrah\rBg99_"; // onde far� a procura 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("express�o: " + matcher.pattern());
		System.out.println("posicoes encontradas");
		
		while(matcher.find()) {
			//2 3 13 16 19  
			System.out.print(matcher.start() + " "); 
		}
		
	}

}

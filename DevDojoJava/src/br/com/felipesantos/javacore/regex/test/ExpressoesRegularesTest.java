package br.com.felipesantos.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// METACARACTERES
		// \D tudo o que n�o for digito
		String regex = "\\D"; // quero procurar
		String texto = "hab123548gfrahg99"; // onde far� a procura 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("express�o: " + matcher.pattern());
		System.out.println("posicoes encontradas");
		
		while(matcher.find()) {
			//0 1 2 9 10 11 12 13 14 
			System.out.print(matcher.start() + " "); 
		}
		
	}

}

package br.com.felipesantos.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// METACARACTERES
		// \w caracteres de palavras - a-z, A-Z, _ e digitos 
		String regex = "\\w"; // quero procurar
		String texto = "h\nab1 235 48gfrah\rg99_"; // onde far� a procura 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("express�o: " + matcher.pattern());
		System.out.println("posicoes encontradas");
		
		while(matcher.find()) {
			//0 2 3 4 6 7 8 10 11 12 13 14 15 16 18 19 20 21  
			System.out.print(matcher.start() + " "); 
		}
		
	}

}

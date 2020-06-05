package br.com.felipesantos.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// METACARACTERES
		// \d todos os digitos
		String regex = "\\d"; // quero procurar
		String texto = "hab123548gfrahg99"; // onde fará a procura 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("expressão: " + matcher.pattern());
		System.out.println("posicoes encontradas");
		
		while(matcher.find()) {
			//3 4 5 6 7 8 15 16 
			System.out.print(matcher.start() + " "); 
		}
		
	}

}

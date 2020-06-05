package br.com.felipesantos.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// METACARACTERES
		// \s espaços em branco - ascii \t \n \f \r
		String regex = "\\s"; // quero procurar
		String texto = "h\nab1 235 48gfrah\rg99"; // onde fará a procura 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("expressão: " + matcher.pattern());
		System.out.println("posicoes encontradas");
		
		while(matcher.find()) {
			//1 5 9 17  
			System.out.print(matcher.start() + " "); 
		}
		
	}

}

package br.com.felipesantos.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		//CLASSES PATTERN E MATCHER
		String regex = "mosca"; // quero procurar
		String texto = "tinha uma mosca no meu prato"; // onde far� a procura 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("express�o: " + matcher.pattern());
		System.out.println("posicoes encontradas");
		
		while(matcher.find()) {
			//indice onde come�a e termina o padr�o (mosca)
			System.out.println(matcher.start() + " e " + matcher.end()); // 10 e 15
		}
		
	}

}

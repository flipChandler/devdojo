package br.com.felipesantos.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// METACARACTERES
		// [] procure esse intervalo de caracteres
		String regex = "0[xX][0-9a-fA-F]"; // intervalo de hexadecimais
		String texto = "12 0x 0X 0xFFAB 0x10G 0x1"; // onde fará a procura 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);
		
		System.out.println("texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("expressão: " + matcher.pattern());
		System.out.println("posicoes encontradas");
		
		while(matcher.find()) {
//			9 0xF
//			16 0x1
//			22 0x1
			System.out.println(matcher.start() + " " +matcher.group()); 
		}
		
	}

}

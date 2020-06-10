package br.com.felipesantos.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

	public static void main(String[] args) {
		// METACARACTERES
		//OCORRENCIAS
		// ? -> zero ou uma
		// * -> zero ou mais
		// + -> uma ou mais
		// {n,m} de n até m ocorrencias
		// () -> agrupa uma expressao
		// | -> ou
		// $ -> encontrar algo que esteja no fim da linha
		// o(v|c)o => procure algo que tenha 'o', seguido de 'v' ou 'c' e seguinte '0'
		// maca(rr|c) ão = macarrão ou macacão
		//. coringa - pode ser substituido por qlq caracter
		//String regex = "0[xX]([0-9a-fA-F])+(\\s|$)"; // pode repetir de uma ou vezes
		//String texto = "12 0x 0X 0xFFAB 0x10G 0x1"; // onde fará a procura
		
		String regex = "([a-zA-z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; // pode repetir de uma ou vezes
		String texto = "fulano@hotmail.com, 102Abc@gmail.com, #@!abrao@mail.br, teste@gmail.com.co.br, teste@mail"; // onde fará a procura
		System.out.println("Email valido? " + "#@!abrao@mail.br".matches(regex)); // false
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(texto);

		System.out.println("texto: " + texto);
		System.out.println("Indice: 0123456789");
		System.out.println("expressão: " + matcher.pattern());
		System.out.println("posicoes encontradas");

		while (matcher.find()) {
//			9 0xF
//			16 0x1
//			22 0x1
			System.out.println(matcher.start() + " " + matcher.group());
		}

	}

}

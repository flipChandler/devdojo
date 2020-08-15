package br.com.felipesantos.javacore.optional.test;

import java.util.Optional;

public class OptionalTest1 {
	private String nome;
	private Optional<String> cpf; // quando olha o atributo, já sabe que esse valor pode ser nulo
	

	// verificar se a variavel era nula, daí a chamava
	public static void main(String[] args) {
		//uma forma de evitar o NullPointerException
		OptionalTest1 optionalTest1 = new OptionalTest1();
		if (optionalTest1.nome != null) {
			System.out.println(optionalTest1.nome.toUpperCase());			
		}
		
		
		optionalTest1.nome = "Felipe";
		//quando se tem certeza que o valor não é nulo, utiliza-se o of
		Optional<String> optional1 = Optional.of(optionalTest1.nome);
		
		//quando se tem certeza que o valor é nulo, utiliza-se o empty
		Optional<String> optional2 = Optional.empty();
		
		//quando não sabe se é nulo ou não, utiliza-se o ofNullable
		Optional<String> optional3 = Optional.ofNullable(optionalTest1.nome);

		System.out.println(optional1);
		System.out.println(optional2);
		System.out.println(optional3);
		
		//Buscando valores | se tiver um valor, imprime-o, senão imprime vazio
		System.out.println(optional1.orElse("vazio"));
		System.out.println(optional2.orElse("vazio"));
		System.out.println(optional3.orElse("vazio"));
		
		
		 
		
		
		
		
	}

}

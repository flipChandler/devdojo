package br.com.felipesantos.javacore.optional.test;

import java.util.Optional;

import br.com.felipesantos.javacore.optional.classes.Carro;
import br.com.felipesantos.javacore.optional.classes.Pessoa;
import br.com.felipesantos.javacore.optional.classes.Seguradora;

public class OptionalTest2 {

	public static void main(String[] args) {
//		Seguradora seguradora = new Seguradora("Azul");
//		System.out.println(obterNomeSeguradoraOptional(seguradora));
		Seguradora seguradora = new Seguradora("DevDojo Seguros");
		Carro carro = new Carro(seguradora, "Audi");
		Pessoa pessoa = new Pessoa(carro, "Carlos");
		
		System.out.println(obterNomeSeguradora(Optional.ofNullable(pessoa)));
	}
	
	
	
	public static String obterNomeSeguradora(Optional<Pessoa> pessoa) {
		return 	pessoa.flatMap(Pessoa::getCarro)
				.flatMap(Carro::getSeguradora)
				.map(Seguradora::getNome)
				.orElse("Não existe seguradora");
				
	}
	
	
	
//	public static String obterNomeSeguradoraOptional(Seguradora seguradora) {
//		//System.out.println(Optional.ofNullable(seguradora).map(Seguradora::getNome));   Optional[Optional[Azul]]
//		System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora::getNome).orElse("vazio"));// Azul 
//		return "";
//	}
	
//	private static String obterNomeSeguradora(Seguradora seguradora) {
//		String nome = "";
//		if (seguradora.getNome() != null) {
//			//nome = seguradora.getNome();
//		}
//		return nome;
//	}
}

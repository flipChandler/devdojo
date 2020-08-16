package br.com.felipesantos.javacore.optional.test;

import java.util.HashMap;
import java.util.Map;
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
		
		checarNomeSeguradora(seguradora);
		checarSeguradoraOptional(seguradora);
		pessoa.setIdade(22);
		System.out.println(obterNomeSeguradoraComIdade(pessoa, 18));
		
		Map<String, String> map = new HashMap<>();
		System.out.println(Optional.ofNullable(map.get("kaka"))); // Optional.empty
		
		System.out.println(stringToInt("A"));// Optional.empty
	}
	
	private static Optional<Integer> stringToInt(String numero){
		try {
			return Optional.of(Integer.parseInt(numero));
		} catch (NumberFormatException e) {
			return Optional.empty();
		}
	}
	
	private static void checarNomeSeguradora(Seguradora seguradora) {
		if (seguradora != null && seguradora.getNome().equals("DevDojo Seguros")) {
			System.out.println("é o DevDojo");
		}
	}
	 	
	private static void checarSeguradoraOptional(Seguradora seguradora) {
		Optional.ofNullable(seguradora).filter(seg -> seg.getNome().equals("DevDojo Seguros"))
		.ifPresent(x -> System.out.println("é o Devdojo"));
	}
	
	private static String obterNomeSeguradoraComIdade(Pessoa p, int idadeMinima) {
		return Optional.ofNullable(p)
				.filter(pessoa -> pessoa.getIdade() >= idadeMinima)
				.flatMap(Pessoa::getCarro)
				.flatMap(Carro::getSeguradora)
				.map(Seguradora::getNome)
				.orElse("Não existe seguradora ou a idade minima não foi atingida");
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

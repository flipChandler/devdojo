package br.com.felipesantos.javacore.streams.test;

import java.util.Comparator;
import java.util.List;

import br.com.felipesantos.javacore.streams.classes.Pessoa;

public class StreamTest3 {

	public static void main(String[] args) {
		List<Pessoa> pessoas = Pessoa.bancoDePessoas(); 
		System.out.println(pessoas.stream().anyMatch(p -> p.getSalario() > 4000));// true
		System.out.println(pessoas.stream().allMatch(pessoa -> pessoa.getIdade() > 18)); // true 
		System.out.println(pessoas.stream().noneMatch(pessoa -> pessoa.getIdade() < 18)); // true 
		
		pessoas.stream().filter(p -> p.getIdade() < 25)
			.findAny() // acha o primeiro que o filter selecionar < 25 | retorna um Optional 
			.ifPresent(p -> System.out.println(p.getNome()));
		
		pessoas.stream()
			.filter(p -> p.getIdade() > 30)
			.sorted(Comparator.comparing(Pessoa::getIdade).reversed()) // ordenou na ordem reversa por idade
			.findFirst() // retorna um Optional
			.ifPresent(p -> System.out.println(p.getNome()));
	}

}

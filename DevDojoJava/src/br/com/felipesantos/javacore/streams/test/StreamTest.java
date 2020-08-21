package br.com.felipesantos.javacore.streams.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.felipesantos.javacore.streams.classes.Pessoa;

public class StreamTest {

	public static void main(String[] args) {
		//Pegar os 3 primeiros nomes das pessoas com menos de 25 anos
		// ordenados pelo nome
		List<Pessoa> pessoas = Pessoa.bancoDePessoas();
		Collections.sort(pessoas, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
		
		// sem Streams 
		List<String> nomes = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getIdade() < 35) {
				nomes.add(pessoa.getNome());
				if (nomes.size() >= 3) {
					break;
				}
			}
		}
		
		System.out.println(nomes);
		
		System.out.println();
		
		// Com Streams
		List<String> nomes2 = pessoas
				.stream()
				.filter(pessoa -> pessoa.getIdade() < 35) // filtrar pessoas < 35 anos
				.sorted(Comparator.comparing(Pessoa::getNome)) // ordenando pelo nome 
				.limit(3) // top 3
				.map(Pessoa::getNome) // mapeie as pessoas pelo nome
				.collect(Collectors.toList()); // retorne nomes2 em lista 
		
		System.out.println(nomes2);
		
			
	}

}

package br.com.felipesantos.javacore.streams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		
		//flatMap -> tem vários valores e deseja concatenar esses valores em um só
		List<List<String>> nomes = new ArrayList<>();
		nomes.add(Arrays.asList("DevDojo", "Valeu por aumentar a letra"));
		nomes.add(Arrays.asList("Felipe", "tamu junto, meu parceiro"));
		nomes.add(Arrays.asList("Janaina", "passageira, vai limpando o salão"));
		/*Stream<String> stringStream = nomes.stream().flatMap(Collection::stream); // juntou tudo e colocou em stringStream		
		stringStream.forEach(System.out::print); 
		*/
		List<String> lista = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
		
		System.out.println(lista); //tudo dentro de uma lista

		
		//map -> aplica a função em cada elemento e retorna o valor coletado em um novo stream
		List<String> palavras = Arrays.asList("Felipe", "Goku", "Vegeta");
		String[] split = palavras.get(0).split("");// pegou cada silaba do primeiro elemento e guardou em split 
		System.out.println(Arrays.toString(split)); // [F, e, l, i, p, e]
		List<String[]> lista2 = palavras.stream().map(p -> p.split("")).collect(Collectors.toList()); 
		
		//Stream<String> stream = Arrays.stream((String[]) palavras.toArray()); // converte um Array em um Stream de String
		
		List<String> listaString = palavras.stream() // Stream<String>
				.map(p -> p.split("")) // Stream<String[]> = Stream Array de String
				.flatMap(Arrays::stream) // Stream<String>
				.collect(Collectors.toList()); // converte o stream em lista
		
		System.out.println(listaString); // [F, e, l, i, p, e, G, o, k, u, V, e, g, e, t, a]
		
		
		
		
		
	}

}

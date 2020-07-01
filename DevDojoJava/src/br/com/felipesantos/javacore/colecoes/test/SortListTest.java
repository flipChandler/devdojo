package br.com.felipesantos.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Felipe");
		nomes.add("Rafaela");
		nomes.add("Juca");
		nomes.add("Josi");
		nomes.add("Priscila");
		nomes.add("Karina");
		nomes.add(0, "Biro-Biro"); 
		
		Collections.sort(nomes); // ordena em ordem alfabetica pq é String
		
		List<Double> numeros = new ArrayList<>();
		numeros.add(1.3);
		numeros.add(1.4);
		numeros.add(1.7);
		numeros.add(3.3);
		
		Collections.sort(numeros); // ordena os numeros em ordem crescente
		
		nomes.forEach(System.out::println); //printa Biro-Biro primeiro
		
		System.out.println();
		
		numeros.forEach(System.out::println);
		
	}

}

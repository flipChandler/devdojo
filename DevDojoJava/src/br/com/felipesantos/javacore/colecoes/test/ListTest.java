package br.com.felipesantos.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//Generics | a instancia está programando orientado a interfaces (List)
		List<String> nomes = new ArrayList<>();
		nomes.add("Felipe");
		nomes.add("Josi");
		nomes.add("Renata");
		nomes.add("Karina");
		nomes.add("Rafaela");
		
		
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println();
		
		nomes.remove("Rafaela");
		nomes.forEach(System.out::println); //forEach do Java 8
		
		System.out.println();
		
		List<String> nomes2 = new ArrayList<>();
		nomes2.add("Juca");
		nomes2.add("Plinio");
		nomes2.add("Priscila");
		nomes2.add("Bolena");
		
		nomes.addAll(nomes2);// acrescenta o ArrayList no fim de nomes 
		
		nomes.forEach(System.out::println); 
		
		
		
		
		
		
	}

}

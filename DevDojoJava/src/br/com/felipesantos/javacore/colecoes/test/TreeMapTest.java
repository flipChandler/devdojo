package br.com.felipesantos.javacore.colecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import br.com.felipesantos.javacore.colecoes.classes.Consumidor;

public class TreeMapTest {

	public static void main(String[] args) {
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("A", "Letra A");
		map.put("D", "Letra D");
		map.put("B", "Letra B");
		map.put("C", "Letra C");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println(map.headMap("C", true)); // mostra os valores anteriores e inclusive de C
		System.out.println(map.higherKey("C")); // higher than C => D
		System.out.println(map.descendingMap());// decrescente -> {D=Letra D, C=Letra C, B=Letra B, A=Letra A}
		
		
		System.out.println();
		
		NavigableMap<String, Consumidor> map2 = new TreeMap<>();
		Consumidor consumidor1 = new Consumidor("Felipe Santos", "11111");
		Consumidor consumidor2 = new Consumidor("Alicia Santos", "22222");
		map2.put("D", consumidor1);
		map2.put("A", consumidor2);// o que manda é a chave String
		
		for (Map.Entry<String, Consumidor> entry2 : map2.entrySet()) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());			
		}
		
		
	}

}

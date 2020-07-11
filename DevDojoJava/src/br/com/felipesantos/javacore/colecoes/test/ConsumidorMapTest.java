package br.com.felipesantos.javacore.colecoes.test;

import java.util.HashMap;
import java.util.Map;

import br.com.felipesantos.javacore.colecoes.classes.Consumidor;
import br.com.felipesantos.javacore.colecoes.classes.Produto;

public class ConsumidorMapTest {

	public static void main(String[] args) {
		Consumidor consumidor1 = new Consumidor("Felipe", "122");
		Consumidor consumidor2 = new Consumidor("Karina", "321");
		
		Produto produto1 = new Produto("123", "Laptop", 2000.0);
		Produto produto2 = new Produto("321", "Picanha", 16d);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0);
		Produto produto4 = new Produto("012", "Samsung Galaxy S7 64gb", 3250.5);
		
		// ASSOCIAR UM CONSUMIDOR A UM DETERMINADO PRODUTO
		Map<Consumidor, Produto> map = new HashMap<>();
		map.put(consumidor1, produto2);
		map.put(consumidor2, produto4);
		
		for (Map.Entry<Consumidor, Produto> entry : map.entrySet()) {
			System.out.println(entry.getKey().getNome() + " " + entry.getValue().getNome());
		}
		
		
	}

}

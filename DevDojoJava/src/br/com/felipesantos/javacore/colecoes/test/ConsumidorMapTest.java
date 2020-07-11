package br.com.felipesantos.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		Map<Consumidor, List<Produto>> map = new HashMap<>();
		
		List<Produto> produtoConsumidor1 = new ArrayList<>();
		produtoConsumidor1.add(produto1);
		produtoConsumidor1.add(produto2);
		
		
		List<Produto> produtoConsumidor2 = new ArrayList<>();
		produtoConsumidor2.add(produto3);
		produtoConsumidor2.add(produto4);
		
		map.put(consumidor1, produtoConsumidor1);
		map.put(consumidor2, produtoConsumidor2);
		for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
			System.out.println("Produtos de " + entry.getKey().getNome());
			for (Produto produto : entry.getValue()) {
				System.out.println(produto.getNome());
			}
			System.out.println();
		}	
		
	}

}

package br.com.felipesantos.javacore.colecoes.test;

import java.util.NavigableSet;
import java.util.TreeSet;

import br.com.felipesantos.javacore.colecoes.classes.Celular;
import br.com.felipesantos.javacore.colecoes.classes.CelularNomeComparator;
import br.com.felipesantos.javacore.colecoes.classes.Produto;

public class TreeSetTest {

	public static void main(String[] args) {
		Produto produto1 = new Produto("123", "Laptop", 2000.0, 10);
		Produto produto2 = new Produto("321", "Picanha", 16d, 10);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
		Produto produto4 = new Produto("012", "Samsung Galaxy S7 64gb", 3250.5, 0);
		Produto produto5 = new Produto("013", "Samsung Galaxy S10 128gb", 1d, 0);
		
		Celular celular = new Celular("iphone 10", "1234");
		
		// tem que implementar o Comparator qndo utilizar o TreeSet | na Celular não tem nenhuma implementação 
		NavigableSet<Celular> celularNavigableSet = new TreeSet<>(new CelularNomeComparator());
		
		//A classe Produto implementa Comparable<Produto>
		NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
		
		produtoNavigableSet.add(produto1);
		produtoNavigableSet.add(produto2);
		produtoNavigableSet.add(produto3);
		produtoNavigableSet.add(produto4);
		produtoNavigableSet.add(produto5);
		
				
		//printa cada produto em ordem crescente de serialNumber
		for (Produto produto : produtoNavigableSet) {
			System.out.println(produto);
		}	
		
		System.out.println("------------------");
		// lower < 
		// floor <=
		// higher >
		// ceiling >=
		
		System.out.println(produtoNavigableSet.lower(produto4));
	}
	
	// revisar a aula de TreeSet depois

}

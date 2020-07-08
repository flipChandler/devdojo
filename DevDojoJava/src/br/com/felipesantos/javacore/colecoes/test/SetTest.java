package br.com.felipesantos.javacore.colecoes.test;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.felipesantos.javacore.colecoes.classes.Produto;

public class SetTest {

	public static void main(String[] args) {
		Produto produto1 = new Produto("123", "Laptop", 2000.0, 10);
		Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
		Produto produto4 = new Produto("012", "Samsung Galaxy S7 64gb", 3250.5, 0);
		Produto produto5 = new Produto("012", "Samsung Galaxy S10 128gb", 6000.3, 0); // n�o foi inserido | hashCode == produto4
		
		// Set n�o permite elementos duplicados
		//Set n�o � indexado | os elementos n�o ficam ordenados
		//percorrer o Set usa-se forEach ou iterator
		//Set<Produto> produtoSet = new HashSet<>();
		Set<Produto> produtoSet = new LinkedHashSet<>(); //colocar em ordem de inser��o
		
		produtoSet.add(produto1);
		produtoSet.add(produto2);
		produtoSet.add(produto3);
		produtoSet.add(produto4);
		produtoSet.add(produto5);
				
		for(Produto produto : produtoSet) {
			System.out.println(produto);
		}
	}

}

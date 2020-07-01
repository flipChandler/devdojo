package br.com.felipesantos.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.felipesantos.javacore.colecoes.classes.Produto;
import br.com.felipesantos.javacore.colecoes.classes.ProdutoNomeComparator;

public class SortProdutoTest {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("123", "Celular", 2000);
		Produto produto2 = new Produto("321", "Picanha", 26.4);
		Produto produto3 = new Produto("079", "Teclado", 1000);
		Produto produto4 = new Produto("489", "Laptop Lenovo", 3200.5);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		Collections.sort(produtos, new ProdutoNomeComparator());// faz a ordena��o de produto pela classe ProdutoNomeComparator
		produtos.forEach(System.out::println);
	}

}

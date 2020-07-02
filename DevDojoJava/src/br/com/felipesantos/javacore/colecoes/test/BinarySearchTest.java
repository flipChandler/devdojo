package br.com.felipesantos.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import br.com.felipesantos.javacore.colecoes.classes.Produto;
import br.com.felipesantos.javacore.colecoes.classes.ProdutoNomeComparator;

public class BinarySearchTest {

	public static void main(String[] args) {
		//binarySearch retorna o indice
		List<Integer> numeros = new ArrayList<>();
		numeros.add(2);
		numeros.add(0);
		numeros.add(4);
		numeros.add(3);
		
		//index  0 1 2 3
		//values 0 2 3 4
		
		Collections.sort(numeros);
		System.out.println(Collections.binarySearch(numeros, 2));// quero o indice do valor 2 -> 1
		System.out.println(numeros.get(Collections.binarySearch(numeros, 2)));// traz o valor do index 1 -> 2
		
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("123", "Iphone", 3000);
		Produto produto2 = new Produto("233", "Teclado", 300);
		Produto produto3 = new Produto("345", "Sony Xperia", 1500);
		Produto produto4 = new Produto("456", "Monitor", 700);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		Collections.sort(produtos, new ProdutoNomeComparator()); //ordenar pelo nome dos produtos
		Produto produto5 = new Produto("000", "Antena", 50);
		
		System.out.println(Collections.binarySearch(produtos, produto5, new ProdutoNomeComparator())); // -1 (index) , pq Antena deve vir antes 
		produtos.forEach(System.out::println);
		
		Integer[] arrayInteger = new Integer[4];
		arrayInteger[0] = 2;
		arrayInteger[1] = 0;
		arrayInteger[2] = 4;
		arrayInteger[3] = 3;
		
		Arrays.sort(arrayInteger);
		
		Arrays.stream(arrayInteger)
			.forEach(System.out::print);
		
		System.out.println(Arrays.binarySearch(arrayInteger, 1));// em qual posição eu devo inserir o valor 1 -> -2
		
		
		
	}

}

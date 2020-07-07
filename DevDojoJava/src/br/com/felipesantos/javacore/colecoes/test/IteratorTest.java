package br.com.felipesantos.javacore.colecoes.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import br.com.felipesantos.javacore.colecoes.classes.Produto;

public class IteratorTest {

	public static void main(String[] args) {
		//LinkedList, o remove é mais rápido do q em ArrayList
		//ArrayList, o get é mais rápido do q o LinkedList
		List<Produto> produtos = new LinkedList<>();
		Produto produto1 = new Produto("123", "Laptop", 2000.0, 10);
		Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
		Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
		Produto produto4 = new Produto("456", "Samsung Galaxy S7 64gb", 3250.5, 0);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		
		Iterator<Produto> produtoIterator = produtos.iterator();// aponta se hasNext() e next()
		
		while(produtoIterator.hasNext()) { // tem o proximo? (retorna um boolean)
			if (produtoIterator.next().getQuantidade() == 0) {
				produtoIterator.remove();
			}			
			
//			Produto produto = produtoIterator.next(); // venha cá
//			if(produto.getQuantidade() == 0) { //produto com qtde == 0
//				produtoIterator.remove();
//			}
		}
		
		System.out.println(produtos.size());// 2
		
		
		

	}

}

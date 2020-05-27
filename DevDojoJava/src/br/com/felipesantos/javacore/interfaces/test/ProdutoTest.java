package br.com.felipesantos.javacore.interfaces.test;

import br.com.felipesantos.javacore.interfaces.classes.Produto;

public class ProdutoTest {

	public static void main(String[] args) {
		Produto produto = new Produto("Notebook", 4, 3000);
		produto.calcularImposto();
		produto.calcularFrete();
		System.out.println(produto);

	}

}

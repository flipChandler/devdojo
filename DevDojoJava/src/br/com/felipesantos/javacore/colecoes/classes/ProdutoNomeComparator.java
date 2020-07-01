package br.com.felipesantos.javacore.colecoes.classes;

import java.util.Comparator;

public class ProdutoNomeComparator implements Comparator<Produto> {

	// para fazer a ordenação de produto pelo nome
	@Override
	public int compare(Produto produto1, Produto produto2) {
		return produto1.getNome().compareTo(produto2.getNome());
	}

}

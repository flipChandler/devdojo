package br.com.felipesantos.javacore.colecoes.classes;

import java.util.Comparator;

public class CelularNomeComparator implements Comparator<Celular>{

	@Override
	public int compare(Celular o1, Celular o2) {		
		return o1.getNome().compareTo(o2.getNome());
	}

}
 
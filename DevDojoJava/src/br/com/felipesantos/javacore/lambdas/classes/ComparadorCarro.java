package br.com.felipesantos.javacore.lambdas.classes;

public class ComparadorCarro {
	public static int comparePorCor(Carro carro1, Carro carro2) {
		return carro1.getCor().compareTo(carro2.getCor());
	}
	
	public int comparePorAno(Carro carro1, Carro carro2) {
		return ((Integer)carro1.getAno()) .compareTo(carro2.getAno());
	}

}

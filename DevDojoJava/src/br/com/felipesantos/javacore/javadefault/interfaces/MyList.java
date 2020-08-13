package br.com.felipesantos.javacore.javadefault.interfaces;

public interface MyList {
	// métodos estáticos necessitam de um corpo
	// a partir do Java 8, métodos estáticos puderam ser criados em interfaces
	static void sort() {
		System.out.println("dentro do sort");
	}
	
	
	void add();
	
	// métodos default em interfaces não necessitam de serem sobrescritos nas classes implementadas
	default void remove() {
		System.out.println("dentro do remove");
	}
}

package br.com.felipesantos.javacore.javadefault.interfaces;

public interface MyList {
	// m�todos est�ticos necessitam de um corpo
	// a partir do Java 8, m�todos est�ticos puderam ser criados em interfaces
	static void sort() {
		System.out.println("dentro do sort");
	}
	
	
	void add();
	
	// m�todos default em interfaces n�o necessitam de serem sobrescritos nas classes implementadas
	default void remove() {
		System.out.println("dentro do remove");
	}
}

package br.com.felipesantos.javacore.designpatterns.classes;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
	// EAGER INITIALIZATION
	private static final AviaoSingleton INSTANCE = new AviaoSingleton();
	private Set<String> assentosDisponiveis;
	
	
	
	public static AviaoSingleton getInstance() {
		return INSTANCE;
	}

	//CONSTRUTOR PRIVADO, PARA Q O OBJETO DA CLASSE RECEBA SOMENTE getInstance
	// em getInstance vem os assentos disponiveis
	private AviaoSingleton() {
		this.assentosDisponiveis = new HashSet<>();
		assentosDisponiveis.add("1A");
		assentosDisponiveis.add("1B");
		assentosDisponiveis.add("1C");
		assentosDisponiveis.add("1D");
		assentosDisponiveis.add("1E");
		assentosDisponiveis.add("1F");
	}
	
	public boolean bookAssento(String assento) {
		return assentosDisponiveis.remove(assento);
	}
}

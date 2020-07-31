package br.com.felipesantos.javacore.designpatterns.classes;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
	//private static final AviaoSingleton INSTANCE = new AviaoSingleton(); // EAGER INITIALIZATION
	
	private static AviaoSingleton INSTANCE;	
	private Set<String> assentosDisponiveis;	
	
	// LAZY INITIALIZATION | espera a utilização do objeto para alocação de memória do construtor | só cria o objeto se for utilizá-lo
	public static AviaoSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (AviaoSingleton.class) { // faz um double check para não ser possível criar aviao em duplicidade em razão de threads simultaneas, no LAZY
				if (INSTANCE == null) {
					INSTANCE = new AviaoSingleton();
				}
			}
		}
		
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

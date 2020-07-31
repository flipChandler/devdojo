package br.com.felipesantos.javacore.designpatterns.classes;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
	//private static final AviaoSingleton INSTANCE = new AviaoSingleton(); // EAGER INITIALIZATION
	
	private static AviaoSingleton INSTANCE;	
	private Set<String> assentosDisponiveis;	
	
	// LAZY INITIALIZATION | espera a utiliza��o do objeto para aloca��o de mem�ria do construtor | s� cria o objeto se for utiliz�-lo
	public static AviaoSingleton getInstance() {
		if (INSTANCE == null) {
			synchronized (AviaoSingleton.class) { // faz um double check para n�o ser poss�vel criar aviao em duplicidade em raz�o de threads simultaneas, no LAZY
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

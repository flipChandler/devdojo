package br.com.felipesantos.javacore.comportamentoporparametro.interfaces;

import br.com.felipesantos.javacore.comportamentoporparametro.classes.Carro;

@FunctionalInterface // essa � uma classe funcional | s� tem um m�todo
public interface CarroPredicate {
	boolean test(Carro carro);  
	
}

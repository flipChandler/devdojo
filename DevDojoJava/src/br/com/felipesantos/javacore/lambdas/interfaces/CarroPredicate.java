package br.com.felipesantos.javacore.lambdas.interfaces;

import br.com.felipesantos.javacore.lambdas.classes.Carro;

@FunctionalInterface // essa � uma classe funcional | s� tem um m�todo
public interface CarroPredicate {
	boolean test(Carro carro);  
	
}

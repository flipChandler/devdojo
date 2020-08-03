package br.com.felipesantos.javacore.lambdas.interfaces;

import br.com.felipesantos.javacore.lambdas.classes.Carro;

@FunctionalInterface // essa é uma classe funcional | só tem um método
public interface CarroPredicate {
	boolean test(Carro carro);  
	
}

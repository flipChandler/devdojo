package br.com.felipesantos.javacore.comportamentoporparametro.interfaces;

import br.com.felipesantos.javacore.comportamentoporparametro.classes.Carro;

@FunctionalInterface // essa é uma classe funcional | só tem um método
public interface CarroPredicate {
	boolean test(Carro carro);  
	
}

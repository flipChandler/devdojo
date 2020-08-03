package br.com.felipesantos.javacore.comportamentoporparametro.interfaces;

import br.com.felipesantos.javacore.comportamentoporparametro.classes.Carro;

public interface CarroPredicate {
	boolean test(Carro carro);  
}

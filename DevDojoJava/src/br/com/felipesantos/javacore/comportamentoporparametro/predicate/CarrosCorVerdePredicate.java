package br.com.felipesantos.javacore.comportamentoporparametro.predicate;

import br.com.felipesantos.javacore.comportamentoporparametro.classes.Carro;
import br.com.felipesantos.javacore.comportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {

	@Override
	public boolean test(Carro carro) {
		// TODO Auto-generated method stub
		return carro.getCor().equals("verde");
	}

}

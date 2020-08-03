package br.com.felipesantos.javacore.comportamentoporparametro.predicate;

import java.util.Calendar;

import br.com.felipesantos.javacore.comportamentoporparametro.classes.Carro;
import br.com.felipesantos.javacore.comportamentoporparametro.interfaces.CarroPredicate;

public class CarrosDezAnosRecentesPredicate implements CarroPredicate {

	@Override
	public boolean test(Carro carro) {
		return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
	}

}

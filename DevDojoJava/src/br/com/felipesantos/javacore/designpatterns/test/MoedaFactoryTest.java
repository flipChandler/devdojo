package br.com.felipesantos.javacore.designpatterns.test;

import br.com.felipesantos.javacore.designpatterns.classes.Moeda;
import br.com.felipesantos.javacore.designpatterns.classes.MoedaFactory;
import br.com.felipesantos.javacore.jdbc.classes.Pais;

public class MoedaFactoryTest {

	public static void main(String[] args) {
		Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
		System.out.println(moeda.getSimbolo());
	}

}
 
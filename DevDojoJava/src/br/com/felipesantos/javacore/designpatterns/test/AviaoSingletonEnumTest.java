package br.com.felipesantos.javacore.designpatterns.test;

import br.com.felipesantos.javacore.designpatterns.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTest {

	public static void main(String[] args) {
		AviaoSingletonEnum.agendarAssento("1A");
		AviaoSingletonEnum.agendarAssento("1A");

	}

}

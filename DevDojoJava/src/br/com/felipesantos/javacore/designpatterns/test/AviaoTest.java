package br.com.felipesantos.javacore.designpatterns.test;

import br.com.felipesantos.javacore.designpatterns.classes.Aviao;

public class AviaoTest {

	public static void main(String[] args) {
		agendarAssento("1A");
		agendarAssento("1A");
	}
	
	private static void agendarAssento(String assento) {
		Aviao aviao = new Aviao();
		System.out.println(aviao.bookAssento(assento));
	}

	 
}

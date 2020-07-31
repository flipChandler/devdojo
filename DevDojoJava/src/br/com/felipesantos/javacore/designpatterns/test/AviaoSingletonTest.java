package br.com.felipesantos.javacore.designpatterns.test;

import br.com.felipesantos.javacore.designpatterns.classes.AviaoSingleton;

public class AviaoSingletonTest {

	public static void main(String[] args) {
		agendarAssento("1A");// true
		agendarAssento("1A");// false
		agendarAssento("1B");// true
		agendarAssento("1C");// true
		agendarAssento("1C");// false
	}
	
	public static void agendarAssento(String assento) {
		AviaoSingleton aviaoSingleton = AviaoSingleton.getInstance();
		System.out.println(aviaoSingleton.bookAssento(assento));
	}

}

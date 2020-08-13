package br.com.felipesantos.javacore.javadefault.interfaces;

public interface A {
	default void oi() {
		System.out.println("Dentro de oi de A");
	}
}

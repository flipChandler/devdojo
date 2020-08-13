package br.com.felipesantos.javacore.javadefault.interfaces;

public interface B extends A {
	
	default void oi() {
		System.out.println("Dentro de oi de B");
	}

}

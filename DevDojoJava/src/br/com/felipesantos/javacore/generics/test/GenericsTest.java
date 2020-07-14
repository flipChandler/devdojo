package br.com.felipesantos.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

import br.com.felipesantos.javacore.colecoes.classes.Consumidor;

public class GenericsTest {
	//Generics só funciona em tempo de compilação
	public static void main(String[] args) {
		List lista = new ArrayList();
		lista.add("Felipe");
		lista.add(100L);
		lista.add(10.8);
		lista.add(new Consumidor("Alicia", "1111"));
		
		for (Object object : lista) {
			System.out.println(object);
		}
		
		
	}

}

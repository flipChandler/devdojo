package br.com.felipesantos.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

import br.com.felipesantos.javacore.colecoes.classes.Celular;

public class ListCelularTest {

	public static void main(String[] args) {
		Celular celular1 = new Celular("Galaxy S7", "123456");
		Celular celular2 = new Celular("Iphone", "123456");
		Celular celular3 = new Celular("Sony Xperia", "978456");
		
		List<Celular> celulares = new ArrayList<>();
		celulares.add(celular1);
		celulares.add(celular2);
		celulares.add(celular3);
		
		for(Celular celular : celulares) {
			System.out.println(celular);
		}
		
		System.out.println(celulares.contains(celular3));// true
		System.out.println(celular1.equals(celular2));// true, os IMEI's são iguais

	}

}

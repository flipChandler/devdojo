package br.com.felipesantos.javacore.generics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal{
	public abstract void consulta();
}

//tem que implementar Comparable para utilizar ordenarLista
class Cachorro extends Animal  implements Comparable{

	@Override
	public void consulta() {
		System.out.println("Consultando cachorro...");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}


class Gato extends Animal  {

	@Override
	public void consulta() {
		System.out.println("Consultando gato...");
	}
}



public class WildCardTest {
	//caracter coringa é o ?
	
	public static void main(String[] args) {
		Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
		Gato[] gatos = { new Gato(), new Gato() };
		
		//consultaAnimais(cachorros);
		//consultaAnimais(gatos);
		
		List<Cachorro> cachorroList = new ArrayList<>();
		cachorroList.add(new Cachorro());
		
		List<Gato> gatoList = new ArrayList<>();
		gatoList.add(new Gato());		
		
		consultaAnimaisList(cachorroList);
		consultaAnimaisList(gatoList);
		ordenarLista(cachorroList);
	}
	
	public static void consultaAnimais(Animal[] animais) {
		for (Animal animal : animais) {
			animal.consulta();
		}
		
	}
	
	//pode passar qlq coisa que seja subclasse de Animal -> ? extends Animal e garanto que não vou inserir nada
	public static void consultaAnimaisList(List<? extends Animal> animais) {		
		for (Animal animal : animais) {
			animal.consulta();
		}		
	}
	
	public static void consultaCachorroList(List<? super Cachorro> cachorroList) {
		Cachorro cachorro1 = new Cachorro();
		Animal cachorro2 = new Cachorro();
		Object cachorro3 = new Cachorro();
		
		cachorroList.add(cachorro1);
		   
	}
	
	public static void ordenarLista(List<? extends Comparable> lista) {
		Collections.sort(lista);
	}

}

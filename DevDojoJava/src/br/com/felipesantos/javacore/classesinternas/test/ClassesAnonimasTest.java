package br.com.felipesantos.javacore.classesinternas.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.felipesantos.javacore.generics.classes.Carro;

class Animal {
	public void andar() {
		System.out.println("Andando...");
	}
}

public class ClassesAnonimasTest {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			//essa classe anonima surgiu somente para sobrescrever o metodo andar()
			public void andar() {
				System.out.println("andando anonimamente...");
			}
		};
		
		animal.andar();
		
		List<Carro> carroList = new ArrayList<>();
		carroList.add(new Carro("BMW"));
		carroList.add(new Carro("Audi"));
		
		// a classe anonima foi implementada após carroList
		//muito comum também no Java Android
		Collections.sort(carroList, new Comparator<Carro>() {

			@Override
			public int compare(Carro o1, Carro o2) {
				// TODO Auto-generated method stub
				return o1.getNome().compareTo(o2.getNome());
			}
			
		});
		
		System.out.println(carroList);		
	}

}

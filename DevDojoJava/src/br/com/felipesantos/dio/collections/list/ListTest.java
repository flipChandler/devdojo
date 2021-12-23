package br.com.felipesantos.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		System.out.println("Crie uma lista e adicione as sete notas: ");
		List<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.0);
		notas.add(9.4);
		notas.add(5.0);
		notas.add(2.0);
		notas.add(8.5);
		notas.add(7.5);
		
		System.out.println(notas);
		
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5D));
		
		System.out.println("Adicione na lista a nota 8.0 na posição 4:");
		notas.add(4, 8.0);		
		System.out.println(notas);
		
		System.out.println("Substitua a nota 9.4 pela nota 6.0: ");
		notas.set(notas.indexOf(9.4), 6.0);
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
		
		System.out.println("Exiba todas as notas na ordem quem que foram inseridas: ");
		for (Double nota : notas) {
			System.out.println(nota);
		}
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			soma += iterator.next();
			 
		}
		System.out.println("Soma de notas: " + soma);
		
		System.out.println("Exiba a médias das notas: " + (soma / notas.size()));
		
		System.out.println("Remova a nota 2.0: ");
		notas.remove(2.0D);
		System.out.println(notas);
		
		System.out.println("Remova a nota da posição 0: ");
		notas.remove(0);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iteratorNotas = notas.iterator();
		while(iteratorNotas.hasNext()) {
			Double next = iteratorNotas.next();
			if (next < 7) {
				iteratorNotas.remove();
			}
		}
		System.out.println(notas);
		
		System.out.println("Apague toda a lista: ");
		notas.clear();
		System.out.println(notas);
		
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
		
		// utilize LinledList
		System.out.println("Crie uma lista chamada notas2 e "
				+ "coloque todos os elementos da list ArrayList nessa nova lista: ");
		
		System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
		
		System.out.println("Mostre a primeira nota da nova lista removendo-a: ");
		
	}

}

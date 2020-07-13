package br.com.felipesantos.javacore.colecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

import br.com.felipesantos.javacore.colecoes.classes.Consumidor;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.add("D");
		queue.add("C");
		queue.add("B");
		queue.add("A");
		queue.add("E");
		queue.add("F");
		
		System.out.println(queue + " e o tamanho da queue = " + queue.size());
		System.out.println(queue.peek());// retorna o 1 elemento da fila
		System.out.println(queue.poll());// retorna o 1 elemento da fila, removendo-o		
		System.out.println(queue + " e o tamanho da queue = " + queue.size());
		
		
	}

}

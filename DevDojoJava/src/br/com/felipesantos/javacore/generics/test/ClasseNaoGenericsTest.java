package br.com.felipesantos.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

import br.com.felipesantos.javacore.generics.classes.Carro;
import br.com.felipesantos.javacore.generics.classes.Computador;

public class ClasseNaoGenericsTest {

	public static void main(String[] args) {
		CarroAlugavel carroAlugavel = new CarroAlugavel();
		Carro carroAlugado = carroAlugavel.getCarroDisponivel();
		System.out.println("Usando o carro por um mês!");
		carroAlugavel.devolverCarro(carroAlugado);
		
		System.out.println("-----------------------------");
		
		ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
		Computador computador = computadorAlugavel.getComputadorDisponivel();
		System.out.println("Usando o PC...");
		computadorAlugavel.devolverComputador(computador);
	}

}

class CarroAlugavel {
	private List<Carro> carrosDisponiveis = new ArrayList<>();
	{
		carrosDisponiveis.add(new Carro("Gol"));
		carrosDisponiveis.add(new Carro("BMW"));
	}
	
	public Carro getCarroDisponivel() {
		Carro carro = carrosDisponiveis.remove(0);
		System.out.println("Alugando carros: " + carro);
		System.out.println("Carros disponiveis " + carrosDisponiveis);
		return carro;
	}
	
	public void devolverCarro(Carro carro) {
		System.out.println("Devolvendo carro: " + carro);
		carrosDisponiveis.add(carro);
		System.out.println("Carros disponiveis: " + carrosDisponiveis);
	}
	
	
}


class ComputadorAlugavel {
	private List<Computador> computadoresDisponiveis = new ArrayList<>();
	{
		computadoresDisponiveis.add(new Computador("AlienWare"));
		computadoresDisponiveis.add(new Computador("Dell"));
	}
	
	public Computador getComputadorDisponivel() {
		Computador computador = computadoresDisponiveis.remove(0);
		System.out.println("Alugando PC: " + computador);
		System.out.println("PC's disponiveis " + computadoresDisponiveis);
		return computador;
	}
	
	public void devolverComputador(Computador computador) {
		System.out.println("Devolvendo PC: " + computador);
		computadoresDisponiveis.add(computador);
		System.out.println("PC's disponiveis: " + computadoresDisponiveis);
	}
	
	
}

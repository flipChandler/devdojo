package br.com.felipesantos.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

import br.com.felipesantos.javacore.generics.classes.Carro;
import br.com.felipesantos.javacore.generics.classes.Computador;

public class ClasseGenericaTest {

	public static void main(String[] args) {
		List<Carro> carrosDisponiveis = new ArrayList<>();
		carrosDisponiveis.add(new Carro("Gol"));
		carrosDisponiveis.add(new Carro("BMW"));
		
		ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis(carrosDisponiveis);
		Carro carro = carroAlugavel.getObjetoDisponivel();
		System.out.println("Usando o carro por um mês");
		carroAlugavel.devolverObjeto(carro);
		
		System.out.println("-------------------------");
		
		List<Computador> computadoresDisponiveis = new ArrayList<>();
		computadoresDisponiveis.add(new Computador("AlienWare"));
		computadoresDisponiveis.add(new Computador("HP"));
		
		ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis(computadoresDisponiveis);
		Computador pc = computadorAlugavel.getObjetoDisponivel();
		System.out.println("Usando o PC até umas horas!!!");
		computadorAlugavel.devolverObjeto(pc);
	}

}

//T = Type, onde tiver carro, será substituido por T
class ObjetosAlugaveis<T> {
	private List<T> objetosDisponiveis;
	
	public ObjetosAlugaveis(List<T> objetosDisponiveis) {
		this.objetosDisponiveis = objetosDisponiveis;
	}
		
	
	public T getObjetoDisponivel() {
		T t = objetosDisponiveis.remove(0);
		System.out.println("Alugando objetos: " + t);
		System.out.println("Objetos disponiveis " + objetosDisponiveis);
		return t;
	}
	
	public void devolverObjeto(T t) {
		System.out.println("Devolvendo objeto: " + t);
		objetosDisponiveis.add(t);
		System.out.println("Objetos disponiveis: " + objetosDisponiveis);
	}
	
	
}


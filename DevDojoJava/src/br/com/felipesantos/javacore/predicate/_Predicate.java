package br.com.felipesantos.javacore.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _Predicate {
	public static void filtro(List<String> lista, Predicate<String> condicao) {
		for (String s : lista) {
			if (condicao.test(s)) {
				System.out.println(s);
			}			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList("Santa Catarina","Parana",
				"Sao Paulo", "Rio de Janeiro", "Brasilia");
		
		System.out.println("Estados que se iniciam com a letra s");
		filtro(lista, s -> s.startsWith("S"));
		
		System.out.println("Estados que terminam com a letra a");
		filtro(lista, s -> s.endsWith("a"));
		
		System.out.println("Imprime todos os Estados");
		filtro(lista, s -> true);
		
		System.out.println("Não imprime estados");
		filtro(lista, s -> false);
		
		System.out.println("Imprime estados que tem mais de 10 caracteres");
		filtro(lista, s -> s.length() > 10);
	}
}

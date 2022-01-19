package br.com.felipesantos.javacore.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class _Predicate3 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD", 80.90));
		
		list.removeIf(p -> p.getPrice() >= 100);
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		restauraEImprimeLista(list);		
		System.out.println("\nprecos acima de 100 foram removidos");
		list.removeIf(new ProductPredicate());		
		imprimeLista(list);
		
		restauraEImprimeLista(list);		
		System.out.println("\nmetodo estatico da classe Product");
		list.removeIf(Product::staticProductPredicate);
		imprimeLista(list);
		
		restauraEImprimeLista(list);		
		System.out.println("\nmetodo nao-estatico da classe Product");
		list.removeIf(Product::nonStaticProductPredicate);
		imprimeLista(list);
		
		restauraEImprimeLista(list);
		System.out.println("\nvariavel Predicate");
		Predicate<Product> predicate = p -> p.getPrice() >= 100.0;
		list.removeIf(predicate);
		imprimeLista(list);
		
		restauraEImprimeLista(list);
		System.out.println("\npredicate em lambda como parametro em removeIf");
		list.removeIf(p -> p.getPrice() >= 100.0);
		imprimeLista(list);
	}

	private static void imprimeLista(List<Product> list) {
		list.forEach(p -> System.out.println(p));
	}

	private static void restauraEImprimeLista(List<Product> list) {
		System.out.println("\nLista restaurada para o predicate");
		list.add(new Product("TV", 900.0));
		list.add(new Product("Tablet", 350.50));
		
		imprimeLista(list);
	}
}

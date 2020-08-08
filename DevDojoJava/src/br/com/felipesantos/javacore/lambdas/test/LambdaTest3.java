package br.com.felipesantos.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import br.com.felipesantos.javacore.lambdas.classes.Carro;
import br.com.felipesantos.javacore.lambdas.classes.ComparadorCarro;

public class LambdaTest3 {

	public static void main(String[] args) {
		//method references
		forEach(Arrays.asList("Felipe", "Santos", "felip3.santos"), (String texto) -> System.out.println(texto));
		forEach(Arrays.asList("Felipe", "Santos", "felip3.santos"), texto -> System.out.println(texto));
		
		//Java já sabe que vc quer imprimir esse list
		forEach(Arrays.asList("Felipe", "Santos", "felip3.santos"), System.out::println);
		
		List<Carro> carros = Arrays.asList(new Carro("Preto", 2011), new Carro("Azul", 2012), new Carro("Amarelo", 2020), new Carro("Cinza", 2018));
		Collections.sort(carros, (carro1, carro2) -> carro1.getCor().compareTo(carro2.getCor())); // carro1 e 2 são parametros da classe Funcional Comparator
		System.out.println(carros);
		
		//reference to a static method
		Collections.sort(carros, ComparadorCarro::comparePorCor); // pela classe funcional ComparadorCarro já pode chamar o método
		
		// reference to an instance method of a particular object
		ComparadorCarro comparadorCarro = new ComparadorCarro();
		Collections.sort(carros, comparadorCarro::comparePorAno);
		System.out.println(carros);
				
		// reference to an instance method of an arbitrary object of a particular type
		List<String> nomes = Arrays.asList("Felipe", "Josiani", "Sueli", "Gabriela", "Cabral");
		nomes.sort((nome1, nome2) -> nome2.compareTo(nome1)); // implicito que está usando a interface funcional Comparator | ordem reversa
		System.out.println(nomes);
		
		List<String> nomes2 = Arrays.asList("Johnny", "Renata", "Raphael", "Israel", "Paulo", "Amanda", "Carol", "Sheila", "Raquel");
		nomes2.sort(String::compareTo);
		System.out.println(nomes2);
		
		Function<String, Integer> stringToInteger = (texto) -> Integer.parseInt(texto);
		Function<String, Integer> stringToInteger2 = Integer::parseInt;
		System.out.println("10 string para inteiro = " + stringToInteger.apply("10"));
		System.out.println("13 string para inteiro = " + stringToInteger2.apply("13"));		
		
		
		BiPredicate<List<String>, String> contem = (lista, elemento) -> lista.contains(elemento);
		BiPredicate<List<String>, String> contem2 = List::contains; 		
		System.out.println(contem2.test(nomes2, "Sheila"));// true
		
		// reference to a constructor | somente com interfaces funcionais implementadas		
		Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
		Collections.sort(carros, comparadorCarroSupplier.get()::comparePorAno);
		System.out.println(carros);		
		
		BiFunction<String, Integer, Carro> carroBiFunction = (string, inteiro) -> new Carro(string, inteiro);
		BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
		System.out.println(carroBiFunction.apply("rosa",1994));
		System.out.println(carroBiFunction2.apply("pink",2003));
		
	}
	
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T e : list) {
			consumer.accept(e);
		}
	}
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for (T e : list) {
			result.add(function.apply(e));
		}
		return result;
	}

}

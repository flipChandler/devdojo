package br.com.felipesantos.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import br.com.felipesantos.javacore.lambdas.classes.Carro;

public class LambdaTest2 {

	public static void main(String[] args) {
		//Consumer tem apenas um método: accept | qlq tipo 
		forEach(Arrays.asList("Felipe", "Santos", "felip3.santos"), (String string) -> System.out.println(string));
		
		List<Integer> list = map(Arrays.asList("Felipe", "Santos", "felip3.santos"), (String string) -> string.length());
		System.out.println(list);

		List<Carro> carros = Arrays.asList(new Carro("Preto", 2011), new Carro("Preto", 2011), new Carro("Preto", 2011));
		List<String> listCores = map(carros, (Carro carro) -> carro.getCor());
		System.out.println(listCores);
		
		Predicate<Integer> pares = (Integer numero) -> numero % 2 == 0;
		System.out.println(pares.test(1000)); // true
		
		IntPredicate impares = (int numero) -> numero % 2 == 1; // IntPredicate evita processamento desnecessario de Predicate<Integer> | Autoboxing
		System.out.println(impares.test(1000)); // IntPredicate, DoublePredicate, LongPredicate
		
		Predicate<String> adicionarCor = (String cor) -> listCores.add(cor); // adicionarCor recebeu listCores.add(cor)
		adicionarCor.test("amarelo");
		System.out.println(listCores); // [Preto, Preto, Preto, amarelo]
		
		Consumer<String> adicionarCor2 = (cor) -> listCores.add(cor); // adicionarCor2 recebeu listCores.add(cor)
		adicionarCor2.accept("MARROM");
		System.out.println(listCores); // [Preto, Preto, Preto, amarelo, MARROM]
		
		//classe Supplier somente retorna algo
		Supplier<String> saudacao = () -> "Olá, tudo bem?";
		System.out.println(saudacao.get()); // Olá, tudo bem?
		
		Supplier<Carro> carro = () -> new Carro("Azul", 2020);
		System.out.println(carro.get());// Carro [nome=Gol, cor=Azul, ano=2020]
		System.out.println(carro.get().getCor());// Azul
		
		
	}
	
	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T elemento : list) {
			consumer.accept(elemento);
		}
	}
	
	// passa um tipo e retorna outro
	public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for (T elemento : list) {
			result.add(function.apply(elemento));
		}
		return result;
	}
}

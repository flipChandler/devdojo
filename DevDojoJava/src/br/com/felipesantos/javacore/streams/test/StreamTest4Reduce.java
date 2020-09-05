package br.com.felipesantos.javacore.streams.test;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import br.com.felipesantos.javacore.streams.classes.Pessoa;

public class StreamTest4Reduce {

	public static void main(String[] args) {
		Stream<Integer> stream = getStream();
		Optional<Integer> reduceOptional = stream.reduce((x, y) -> x + y); // soma 1 + 2 + 3... | um Optional recebe a soma
		System.out.println(reduceOptional.get());
				
		Integer soma = getStream().reduce(0, (x, y) -> x + y); // soma 1 + 2 + 3 | uma Integer recebe a soma | 0 é o valor inicializado em soma
		System.out.println(soma);
				
		Optional<Integer> soma2 = getStream().reduce(Integer::sum); // soma 1 + 2 + 3 | method reference		
		System.out.println(soma2.get());
		
		Optional<Integer> mult = getStream().reduce((x, y) -> x * y);
		System.out.println(mult.get());
		
		Optional<Integer> maxTernario = getStream().reduce((x, y) -> x > y ? x : y);
		System.out.println(maxTernario.get()); // 9
		
		Optional<Integer> max = getStream().reduce(Integer::max); 
		System.out.println(max.get());// 9
		
		Optional<Integer> minTernario = getStream().reduce((x, y) -> x < y ? x : y);
		System.out.println(minTernario.get());
		
		Optional<Integer> min = getStream().reduce(Integer::min);
		System.out.println(min.get());
		
		// a performance desse método é inferior pq força o Java no auto-boxing dos valores souble to Double
		Stream<Pessoa> streamPessoa = Pessoa.bancoDePessoas().stream();
		Optional<Double> somaSalario = streamPessoa.filter(p -> p.getSalario() > 4000)
				.map(Pessoa::getSalario)
				.reduce(Double::sum);
		System.out.println("Esse é menos perfomático " + somaSalario.get());
		
		Double somaDouble = Pessoa.bancoDePessoas().stream().filter(p -> p.getSalario() > 4000)
				.mapToDouble(Pessoa::getSalario)
				.sum();
		System.out.println("Esse é mais perfomático " + somaDouble);
		
		DoubleStream doubleStream = Pessoa.bancoDePessoas().stream().filter(p -> p.getSalario() > 4000)
				.mapToDouble(Pessoa::getSalario);
		Stream<Double> doubleStream2 = doubleStream.boxed();
		
		
				
		
		
	}
	
	private static Stream<Integer> getStream() {
		return Arrays.asList(1,2,3,4,5,6,7,8,9).stream();
	}

}

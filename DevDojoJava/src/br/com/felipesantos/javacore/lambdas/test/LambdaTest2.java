package br.com.felipesantos.javacore.lambdas.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest2 {

	public static void main(String[] args) {
		//Consumer tem apenas um método: accept | qlq tipo 
		forEach(Arrays.asList("Felipe", "Santos", "felip3.santos"), (String string) -> System.out.println(string));
		
		List<Integer> list = map(Arrays.asList("Felipe", "Santos", "felip3.santos"), (String string) -> string.length());
		System.out.println(list);
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

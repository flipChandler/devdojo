package br.com.felipesantos.javacore.lambdas.test;

import java.util.function.Predicate;

import br.com.felipesantos.javacore.lambdas.classes.Carro;
import br.com.felipesantos.javacore.lambdas.interfaces.CarroPredicate;

public class LambdaTest {

	// anônima, é uma função, pode passar por argumento, concisa
	// (Carro carro) -> carro.getCor().equals("verde");
	// (String s) -> s.length();
	// (int a, int b) -> System.out.println(a + b);
	//(int a, int b) -> (System.out.println(a + b));
	// (parâmetro) -> <expressão>
	
	public static void main(String[] args) {
		CarroPredicate carroPredicate = new CarroPredicate() {
			
			@Override
			public boolean test(Carro carro) {
				
				return carro.getCor().equals("verde");
			}			
		};
		
		System.out.println(carroPredicate.test(new Carro("verde", 2012)));
		
		
		Predicate<Carro> carroPredicate2 = (Carro carro) -> carro.getCor().equals("verde");
		System.out.println(carroPredicate2.test(new Carro("verde", 2015)));
		
		Runnable runnable = () -> System.out.println("Dentro do run");
		new Thread(runnable).start();
		
	}

}

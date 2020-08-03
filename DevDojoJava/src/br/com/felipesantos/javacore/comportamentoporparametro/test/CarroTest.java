package br.com.felipesantos.javacore.comportamentoporparametro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

import br.com.felipesantos.javacore.comportamentoporparametro.classes.Carro;
import br.com.felipesantos.javacore.comportamentoporparametro.interfaces.CarroPredicate;
import br.com.felipesantos.javacore.comportamentoporparametro.predicate.CarrosCorVerdePredicate;
import br.com.felipesantos.javacore.comportamentoporparametro.predicate.CarrosDezAnosRecentesPredicate;

public class CarroTest {
	
	private static List<Carro> filtrarCarroVerde(List<Carro> carros) {
		List<Carro> listaCarros = new ArrayList<>();
		for (Carro carro : carros) {
			if (carro.getCor().equals("verde")) {
				listaCarros.add(carro);
			}
		}
		return listaCarros;
		
	}
	
	private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor) {
		List<Carro> listaCarros = new ArrayList<>();
		for (Carro carro : carros) {
			if (carro.getCor().equalsIgnoreCase((cor))) {
				listaCarros.add(carro);
			}
		}
		return listaCarros;
		
	}
	
	private static List<Carro> filtrarCarroPorDezAnosFabricados(List<Carro> carros) {
		List<Carro> listaCarros = new ArrayList<>();
		for (Carro carro : carros) {
			if (carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10)) {// 2011 > 2010 (estamos em 2020)
				listaCarros.add(carro);
			}
		}
		return listaCarros;
		
	}
	
	public static List<Carro> filtrarCarros(List<Carro> carros, CarroPredicate carroPredicate) {
		List<Carro> listaCarros = new ArrayList<>();
		for (Carro carro : carros) {
			if (carroPredicate.test(carro)) {
				listaCarros.add(carro);
			}
		}
		return listaCarros;
	}
	
	// método genérico para filtrar qualquer coisa
	public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		for (T elemento : list) {
			if (predicate.test(elemento)) {
				result.add(elemento);
			}
		}
		return result;
	}
	

	public static void main(String[] args) {
		List<Carro> carros = Arrays.asList(new Carro("verde", 2011), new Carro("vermelho", 1995), new Carro("preto", 2017));
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		System.out.println(filtrarCarroVerde(carros));
		System.out.println(filtrarCarroPorCor(carros, "Vermelho"));
		System.out.println(filtrarCarroPorDezAnosFabricados(carros));
		
		System.out.println(filtrarCarros(carros, new CarrosCorVerdePredicate()));
		System.out.println(filtrarCarros(carros, new CarrosDezAnosRecentesPredicate()));
		
		System.out.println(filtrarCarros(carros, new CarroPredicate() {// passou por classe anônima

			@Override
			public boolean test(Carro carro) {
				
				return carro.getCor().equals("verde");
			}
			
		}));
		
		System.out.println(filtrar(carros, new Predicate<Carro>() {// passou por classe anônima
			
			@Override
			public boolean test(Carro carro) {
				
				return carro.getCor().equals("verde");
			}			
		}));
		
		System.out.println(filtrar(numeros, new Predicate<Integer>() {// passou por classe anônima
			
			@Override
			public boolean test(Integer numero) {				
				return numero % 2 == 0;
			}			
		}));
		
		// EXPRESSÃO LAMBDA 
		System.out.println(filtrarCarros(carros, carro -> carro.getCor().equals("vermelho")));
	}

}

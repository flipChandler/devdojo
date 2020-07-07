package br.com.felipesantos.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoListasEmArraysTest {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(3);
		numeros.add(7);
		numeros.add(10);
		numeros.add(2);
		
		// de lista para array
		Integer[] numerosArray = new Integer[numeros.size()];		
		numeros.toArray(numerosArray); // numeros (lista) passou o seus valores para numerosArray
		
		System.out.println(numeros);
		System.out.println(Arrays.toString(numerosArray));
		
		
		//de array para lista
		Integer[] numerosArray2 = new Integer[4];
		numerosArray2[0] = 10;
		numerosArray2[1] = 20;
		numerosArray2[2] = 14;
		numerosArray2[3] = 9;
		
		// numeros2 (lista) recebe os valores de numerosArray2 | os 2 elementos estão vinculados, o que add em lista, add no array (tem limite de tamanho)
	
		List<Integer> numeros2 = Arrays.asList(numerosArray2);		
		List<Integer> numeros3 = new ArrayList<>();
		numeros3.addAll(Arrays.asList(numerosArray2));// numeros3 (lista) add numerosArray2 sem vinculo
		numeros3.add(43);

		numeros2.set(0, 200); // setou 200 no index 0 de numeros2 e numerosArray2		
		
		System.out.println("Valores de numerosArray2: " + Arrays.toString(numerosArray2)); // [200, 20, 14, 9]
		System.out.println("Valores de numeros2: " + numeros2); // [200, 20, 14, 9]
		System.out.println("Valores de numeros3: " + numeros3);// [10, 20, 14, 9, 43] 
		
		
	}

}

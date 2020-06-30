package br.com.felipesantos.javacore.colecoes.test;

import br.com.felipesantos.javacore.colecoes.classes.Celular;

public class EqualsTest {

	public static void main(String[] args) {
		String nome1 = "Felipe"; // 
		String nome2 = "Felipe"; // está no msm um pool de string de nome1
		String nome3 = new String("Felipe"); //em outro heap de memoria
		
		Integer int1 = 5;
		Integer int2 = new Integer(5);
		
		System.out.println(nome1 == nome3);// false
		System.out.println(nome1.equals(nome3));// true
		System.out.println(int1.equals(int2));// true
		
		Celular celular1 = new Celular("iPhone", "1234");
		Celular celular2 = new Celular("iPhone", "1234");
		
		System.out.println(celular1.equals(celular2));// true | IMEI's iguais | método equals sobrescrito
		System.out.println(celular1 == celular2);// false | está em outro heap de memória
		
		
	}

}

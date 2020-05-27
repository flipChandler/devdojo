package br.com.felipesantos.javacore.classesabstratas.test;

import br.com.felipesantos.javacore.classesabstratas.classes.Gerente;
import br.com.felipesantos.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTest {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Anna", "12365-8", 2000);	
		Vendedor vendedor = new Vendedor("Marlon", "123654-8", 1500, 5000);
		gerente.calcularSalario();
		vendedor.calcularSalario();
		System.out.println(gerente);
		System.out.println("-------------------");
		System.out.println(vendedor);

	}

}

package br.com.felipesantos.javacore.sobrecargaconstrutores.test;

import br.com.felipesantos.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante estudante = new Estudante("151515", "John", new double[] { 5, 7, 9 }, "2010-09-15");
		
		estudante.imprimeDados();
	}

}

package br.com.felipesantos.aula27.introducaometodos.test;

import java.util.Random;

import br.com.felipesantos.aula27.introducaometodos.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		double[] notas = new double[3];
		
		estudante.setNome("João das Couves");
		estudante.setIdade(33);	
		estudante.setNotas(notas);
		
		for (int i = 0; i < 3;i++) {
			Random random = new Random();
			notas[i] = 10 * random.nextDouble();
			estudante.setNotas(notas);
		}
		
		estudante.imprimeDados();
		estudante.tirarMedia();
		System.out.println("Estudante aprovado?: " + estudante.isAprovado());

	}

}

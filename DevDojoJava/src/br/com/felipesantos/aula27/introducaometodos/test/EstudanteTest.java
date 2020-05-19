package br.com.felipesantos.aula27.introducaometodos.test;

import java.util.Random;

import br.com.felipesantos.aula27.introducaometodos.classes.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();
		
		estudante.nome = "João das Couves";
		estudante.idade = 33;	
		estudante.notas = new double[3];
		
		for (int i = 0; i < 3;i++) {
			Random random = new Random();
			estudante.notas[i] = 10 * random.nextDouble();
		}
		
		estudante.imprimeDados();
		estudante.tirarMedia();

	}

}

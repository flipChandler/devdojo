package br.com.felipesantos.javacore.introducaoclasses.test;

import br.com.felipesantos.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante joao = new Estudante();
		
		joao.nome = "Jo�o da Silva";
		joao.matricula = "123456";
		joao.idade = 33;
		
		System.out.println("Seu nome � " + joao.nome + ", tem " + joao.idade + " anos e sua matricula � " + joao.matricula);
	}

}

package br.com.felipesantos.aula24.introducaoclassestest;

import br.com.felipesantos.aula24.introducaoclasses.Estudante;

public class EstudanteTest {
	public static void main(String[] args) {
		Estudante joao = new Estudante();
		
		joao.nome = "Jo�o da Silva";
		joao.matricula = "123456";
		joao.idade = 33;
		
		System.out.println("Seu nome � " + joao.nome + " e tem " + joao.idade + " anos");
	}

}

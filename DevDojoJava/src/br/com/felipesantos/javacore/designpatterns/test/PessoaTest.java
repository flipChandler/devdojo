package br.com.felipesantos.javacore.designpatterns.test;

import br.com.felipesantos.javacore.designpatterns.classes.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa.PessoaBuilder("Felipe")
				.apelido("Pinguim")
				.nomeDoMeio("dos")
				.ultimoNome("Santos")
				.nomeDoPai("Jos�")
				.build();
		
		System.out.println(pessoa);

	}

}

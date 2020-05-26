package br.com.felipesantos.javacore.override.test;

import br.com.felipesantos.javacore.override.classes.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Joaquina na esquina");
		pessoa.setIdade(300);
		
		System.out.println(pessoa);// o metodo toString que é invocado ao println
		
		
	}

}

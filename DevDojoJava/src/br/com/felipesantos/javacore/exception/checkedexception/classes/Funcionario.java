package br.com.felipesantos.javacore.exception.checkedexception.classes;

import br.com.felipesantos.javacore.exception.customexception.LoginInvalidoException;

public class Funcionario extends Pessoa {
	
	//na sobrescrita de métodos, pode lança apenas uma exceção no método
	//não pode lançar exception que não esteja declarada no metodo da superclasse, somente RuntimeException
	public void salvar() throws LoginInvalidoException {
		
	}
}

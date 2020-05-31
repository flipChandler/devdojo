package br.com.felipesantos.javacore.exception.checkedexception.classes;

import br.com.felipesantos.javacore.exception.customexception.LoginInvalidoException;

public class Funcionario extends Pessoa {
	
	//na sobrescrita de m�todos, pode lan�a apenas uma exce��o no m�todo
	//n�o pode lan�ar exception que n�o esteja declarada no metodo da superclasse, somente RuntimeException
	public void salvar() throws LoginInvalidoException {
		
	}
}

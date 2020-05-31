package br.com.felipesantos.javacore.exception.checkedexception.test;

import java.io.FileNotFoundException;

import br.com.felipesantos.javacore.exception.checkedexception.classes.Funcionario;
import br.com.felipesantos.javacore.exception.checkedexception.classes.Pessoa;
import br.com.felipesantos.javacore.exception.customexception.LoginInvalidoException;

public class SobrescritaComExcpetionsTest {

	public static void main(String[] args) throws LoginInvalidoException {
		Funcionario funcionario = new Funcionario();
		Pessoa pessoa = new Pessoa();
		
		try {
			pessoa.salvar();
		} catch (FileNotFoundException | LoginInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		funcionario.salvar();
	}

}

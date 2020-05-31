package br.com.felipesantos.javacore.exception.checkedexception.test;

import br.com.felipesantos.javacore.exception.customexception.LoginInvalidoException;

public class CustomExceptionTest {

	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void logar() throws LoginInvalidoException{
		String usuarioBancoDeDados = "Goku";
		String senhaBancoDeDados = "111";
		String usuarioDigitado = "Goku";
		String senhaDigitada = "123";
		
		if(!usuarioBancoDeDados.equals(usuarioDigitado)  || !senhaBancoDeDados.equals(senhaDigitada)) { // LEI DE MORGAN
			throw new LoginInvalidoException();				
		}else {
			System.out.println("Logado!");
		}
	}

}

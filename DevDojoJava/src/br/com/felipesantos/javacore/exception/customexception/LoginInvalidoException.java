package br.com.felipesantos.javacore.exception.customexception;

public class LoginInvalidoException extends Exception{
	
	public LoginInvalidoException() {
		super("Usuário e/ou senha inválidos!");
	}

}

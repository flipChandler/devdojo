package br.com.felipesantos.javacore.exception.customexception;

public class LoginInvalidoException extends Exception{
	
	public LoginInvalidoException() {
		super("Usu�rio e/ou senha inv�lidos!");
	}

}

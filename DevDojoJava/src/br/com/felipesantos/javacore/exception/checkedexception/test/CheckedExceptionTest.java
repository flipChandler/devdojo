package br.com.felipesantos.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		criarArquivo();
	}
	
	public static void criarArquivo() {
		File file = new File("Teste.txt");
		try {
			file.createNewFile();
			System.out.println("Arquivo criado!");
		} catch (IOException e) {// exceção do tipo checked
			e.printStackTrace();// apresenta a trilha da stack que deu problema
		}
	}

}

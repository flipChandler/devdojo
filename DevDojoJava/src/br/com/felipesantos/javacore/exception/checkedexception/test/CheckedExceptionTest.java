package br.com.felipesantos.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		try {
			criarArquivo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void criarArquivo() throws IOException {
		File file = new File("Teste.txt");
		try {
			file.createNewFile();
			System.out.println("Arquivo criado!");
		} catch (IOException e) {// exce��o do tipo checked
			e.printStackTrace();// apresenta a trilha da stack que deu problema
			throw e;// relan�ou a IOException para quem est� chamando o m�todo
		}
	}

}

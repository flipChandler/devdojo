package br.com.felipesantos.javacore.exception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		abrirArquivo();
	}

	public static void criarArquivo() throws IOException {
		File file = new File("Teste.txt");
		try {
			file.createNewFile();
			System.out.println("Arquivo criado!");
		} catch (IOException e) {// exceção do tipo checked
			e.printStackTrace();// apresenta a trilha da stack que deu problema
			throw e;// relançou a IOException para quem está chamando o método
		}
	}

	public static void abrirArquivo() {
		File file = new File("Teste.txt");
		try {
			System.out.println("Arquivo criado? : " + file.createNewFile());
			System.out.println("Abrindo um arquivo");
			System.out.println("Executando a leitura do arquivo");
			throw new Exception();
		} catch (Exception e) {
			System.out.println("Dentro do catch");
			e.printStackTrace();
		} finally {
			System.out.println("Fechando o arquivo");
		}
	}

}

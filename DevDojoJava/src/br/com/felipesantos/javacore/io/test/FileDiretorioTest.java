package br.com.felipesantos.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {

	public static void main(String[] args) {
		File diretorio = new File("folder");
		boolean mkdir = diretorio.mkdir();
		System.out.println("Diretorio criado " + mkdir);	
//		File arquivo = new File("D:\\Felipe\\Cursos\\devdojo\\DevDojoJava\\folder\\arquivo.txt");
		File arquivo = new File(diretorio, "arquivo.txt"); // shorthand
		
		try {
			boolean newFile = arquivo.createNewFile();
			System.out.println("Arquivo criado: " + newFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		File arquivoNovoNome = new File(diretorio,"aquivo_renomeado.txt");
		boolean renamed = arquivo.renameTo(arquivoNovoNome);
		System.out.println("Renomeado " + renamed);
		
		File diretorioRenomeado = new File("minhapasta");
		boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
		System.out.println("Diretorio renomeado: " + diretorioRenamed);
		
		buscarArquivos();
		
	}
	
	public static void buscarArquivos() {
		File file = new File("minha_pasta");
		String[] list = file.list();
		
		for(String arquivo : list) {
			System.out.println(arquivo);
		}
		
	}

}

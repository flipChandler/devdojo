package br.com.felipesantos.javacore.io.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {

	public static void main(String[] args) {
		File file = new File("arquivo.txt");
		try(FileWriter fileWriter = new FileWriter(file, true);// true = append, o que for escrito n�o vai sobrescrever ao executar a aplica��o
			FileReader fileReader = new FileReader(file);) { // try-resources n�o precisa chamar o close de writer e reader
			 
			fileWriter.write("\nEscrevendo essa mensagem5 no arquivo\nE pulando uma linha");
			fileWriter.flush();			
			
			char[] in = new char[500];
			int size = fileReader.read(in); // qntos caracteres foram lidos
			System.out.println("Tamanho: " + size);
			for(char texto : in) {
				System.out.print(texto);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

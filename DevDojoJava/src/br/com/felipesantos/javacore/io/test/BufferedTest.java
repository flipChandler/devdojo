package br.com.felipesantos.javacore.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {

	public static void main(String[] args) {
		File file = new File("textoBuffered.txt");
		try {
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write("Escrevendo uma mensagem no arquivo");
			bufferedWriter.newLine();
			bufferedWriter.write("E pulando uma linha");
			bufferedWriter.flush();
			bufferedWriter.close();
			
			FileReader fileReader = new FileReader(file);
			char[] in = new char[500];
			int size = fileReader.read(in);
			System.out.println("Tamanho: " + size);
			
			for(char texto : in) {
				System.out.print(texto);
			}
			fileReader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}

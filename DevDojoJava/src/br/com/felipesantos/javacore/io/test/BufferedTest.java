package br.com.felipesantos.javacore.io.test;

import java.io.BufferedReader;
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
			bufferedWriter.flush(); // usado somente para a escrita
			bufferedWriter.close();
			
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String texto = null;
			
			while((texto = bufferedReader.readLine()) != null) {
				System.out.println(texto);
			}
			
			bufferedReader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}

package br.com.felipesantos.javacore.exception.checkedexception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWithResourcesTest {

	public static void main(String[] args) {
		
	}
	
	public static void lerArquivoJava6() {
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("text.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void lerArquivoJava7() throws IOException { // NÃO PRECISA DO CATCH
		// classes instaciadas somente as que tem as interfaces closeable e autocloseable
		try ( Reader reader = new BufferedReader(new FileReader("text.txt")) ){ 	
		}
	}
	
	public static void outroLerArquivoJava7() { 
		try ( Reader reader = new BufferedReader(new FileReader("text.txt")) ){ 	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

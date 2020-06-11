package br.com.felipesantos.javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
/*
 * File
 * FileReader
 * BufferedReader
 * FileWriter
 * BufferedWriter
 */
	
	public static void main(String[] args) {
		File file = new File("arquivo.text");
		try {
			boolean newFile = file.createNewFile();
			System.out.println(newFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

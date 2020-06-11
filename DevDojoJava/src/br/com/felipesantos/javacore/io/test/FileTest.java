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
			System.out.println(file.createNewFile());
			boolean exists = file.exists();
			if(exists) {
				System.out.println("Deletado? " + file.delete());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

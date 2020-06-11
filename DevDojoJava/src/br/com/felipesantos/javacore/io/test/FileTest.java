package br.com.felipesantos.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

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
			System.out.println("Permissão de leitura? " + file.canRead());
			System.out.println("Path: " + file.getPath());
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Diretorio? " + file.isDirectory());
			System.out.println("Arquivo oculto? " + file.isHidden());
			System.out.println("Ultima modificação? " + new Date(file.lastModified()));
			
			if(exists) {
				System.out.println("Deletado? " + file.delete());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

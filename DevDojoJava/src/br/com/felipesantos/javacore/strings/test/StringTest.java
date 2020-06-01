package br.com.felipesantos.javacore.strings.test;

public class StringTest {
	
	public static void main(String[] args) {
		String nome = "Felipe";		
		String sobrenome = new String("Santos");
		nome = nome.concat(" Santos");
		String nome2 = "Felipe"; // uma variavel foi criada e referencia Felipe, que está no pool de Strings 
		String nome3 = new String("Catarina"); // 1-cria uma variavel de referencia 2 - um obj tipo string 3 - uma string no pool de String
		System.out.println(nome); // Felipe Santos
	}

}

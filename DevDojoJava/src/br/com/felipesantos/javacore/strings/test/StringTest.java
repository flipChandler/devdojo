package br.com.felipesantos.javacore.strings.test;

public class StringTest {
	
	public static void main(String[] args) {
		String nome = "Felipe";		
		String sobrenome = new String("Santos");
		nome = nome.concat(" Santos"); // nome += " Santos";
		String nome2 = "Felipe"; // uma variavel foi criada e referencia Felipe, que está no pool de Strings 
		String nome3 = new String("Catarina"); // 1-cria uma variavel de referencia 2 - um obj tipo string 3 - uma string no pool de String
		System.out.println(nome); // Felipe Santos
		
		String teste = "Goku";
		String teste2 = "goku";
		System.out.println(teste.charAt(2)); // k
		System.out.println(teste.equals(teste2)); // false
		System.out.println(teste.equalsIgnoreCase(teste2)); // true
		System.out.println(teste.length()); // 4
		System.out.println(teste.replace('o', 'a')); // Gaku
		System.out.println(teste.toLowerCase()); // goku
		System.out.println(teste.toUpperCase()); // GOKU
		
		String teste3 = "0123456789";
		System.out.println(teste3.substring(0,4)); //0123
		
		String teste4 = "   0123456789   ";
		System.out.println(teste4.trim()); //0123456789
		
		
	}

}

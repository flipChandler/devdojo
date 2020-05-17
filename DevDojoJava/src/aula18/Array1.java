package aula18;

public class Array1 {

	public static void main(String[] args) {
		// ARRAY É SEMPRE UM OBJETO
		// byte, short, int, long, float, double inicializa com 0
		// char '\u0000' ' '
		//boolean false
		// reference null (ex.: String)
		int [] idades = new int[5];
		
		idades[0] = 40;
		idades[1] = 12;
		idades[2] = 7;
		idades[3] = 100;
		idades[4] = 123;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.printf("O valor na posição %d é %d \n", i, idades[i]);
		}
		
		System.out.println("PULA LINHA");
		
		String [] nomes = new String[3];
		
		nomes[0] ="Brad";
		nomes[1] = "Tom";
		nomes[2] = "Monica";
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Imprima o nome na posição " + i + " " + nomes[i]);
		}
		
		//GARBAGE COLLECTOR DO JAVA LIMPA OS REGISTROS DE nomes ACIMA E ACRESCENTA MAIS UM INDICE
		nomes = new String[4];
		
	}

}

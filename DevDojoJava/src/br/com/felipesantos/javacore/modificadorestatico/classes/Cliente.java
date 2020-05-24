 package br.com.felipesantos.javacore.modificadorestatico.classes;

public class Cliente {
	/* 0 - Bloco de inicalizacao estático é executado quando a JVM carrega a classe (é executado apenas uma vez)
	 * 1 - Alocado espaço na memoria para o objeto que será criado 
	 * 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
	 * 3 - Bloco de inicialização é executado
	 * 4 - O construtor é
	 * executado
	 */
	private static int[] parcelas;

	//BLOCO DE INICIALIZACAO ESTÁTICA SOMENTE É CHAMADO UMA VEZ, MESMO COM 3 OBJETOS DA MESMA CLASSE
	
	{
		System.out.println("Bloco de inicialização não estático");
	}
	
	static{
		System.out.println("Dentro do bloco de inicialização estático");
		parcelas = new int[100];
		for (int i = 1; i <= 100; i++) {
			parcelas[i - 1] = i;
		}
		System.out.println();
	}
	
	static {
		System.out.println("Bloco de inicalização 2");
	}
	
	static {
		System.out.println("Bloco de inicalização 3");
	}

	public Cliente() {

	}

	public static int[] getParcelas() {
		return parcelas;
	}
	
}

 package br.com.felipesantos.javacore.modificadorestatico.classes;

public class Cliente {
	/* 0 - Bloco de inicalizacao est�tico � executado quando a JVM carrega a classe (� executado apenas uma vez)
	 * 1 - Alocado espa�o na memoria para o objeto que ser� criado 
	 * 2 - Cada atributo de classe � criado e inicializado com seus valores default ou valores explicitos
	 * 3 - Bloco de inicializa��o � executado
	 * 4 - O construtor �
	 * executado
	 */
	private static int[] parcelas;

	//BLOCO DE INICIALIZACAO EST�TICA SOMENTE � CHAMADO UMA VEZ, MESMO COM 3 OBJETOS DA MESMA CLASSE
	
	{
		System.out.println("Bloco de inicializa��o n�o est�tico");
	}
	
	static{
		System.out.println("Dentro do bloco de inicializa��o est�tico");
		parcelas = new int[100];
		for (int i = 1; i <= 100; i++) {
			parcelas[i - 1] = i;
		}
		System.out.println();
	}
	
	static {
		System.out.println("Bloco de inicaliza��o 2");
	}
	
	static {
		System.out.println("Bloco de inicaliza��o 3");
	}

	public Cliente() {

	}

	public static int[] getParcelas() {
		return parcelas;
	}
	
}

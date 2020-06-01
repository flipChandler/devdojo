package br.com.felipesantos.javacore.strings.test;

public class StringPerformanceTest {

	public static void main(String[] args) {
		long inicio = System.currentTimeMillis();//inicia o timer
		concatString(30000);// executa essa tarefa
		long fim = System.currentTimeMillis();// finaliza o timer
		System.out.println("Tempo gasto String" + (fim-inicio) + " ms"); // 670 ms (milissegundos)
		
		inicio = System.currentTimeMillis();
		concatStringBuilder(900000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuilder " + (fim-inicio) + " ms"); // 15 ms (milissegundos)
		
		inicio = System.currentTimeMillis();
		concatStringBuffer(900000);
		fim = System.currentTimeMillis();
		System.out.println("Tempo gasto StringBuffer " + (fim-inicio) + " ms"); // 32 ms (milissegundos)
	}
	
	private static void concatString(int tamanho) {
		String string = "";
		
		for(int i = 0; i < tamanho;i++) {
			string += i;
		}
	}
	
	// StringBuilder != StringBuffer (synchronized)
	// StringBuilder => melhor performance
	private static void concatStringBuilder(int tamanho) {
		StringBuilder stringBuilder = new StringBuilder(tamanho);
		
		for(int i = 0; i < tamanho;i++) {
			stringBuilder.append(i);
		}
	}
	
	private static void concatStringBuffer(int tamanho) {
		StringBuffer stringBuffer = new StringBuffer(tamanho);
		
		for(int i = 0; i < tamanho;i++) {
			stringBuffer.append(i);
		}
	}
}

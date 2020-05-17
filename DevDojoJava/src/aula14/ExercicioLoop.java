package aula14;

public class ExercicioLoop {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.printf("O valor de i é %d\n", i);
		}
		
		//IMPRIMA TODOS OS NÚMEROS PARES DE 0 ATÉ 100
		for (int i = 0; i <= 100; i+=2) {
			System.out.println(i);
		}
		
		//regra: as parcelas tem que ser maior q mil
		//dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
		
		double valorCarro = 10000;
		
		for (int parcela = 1; parcela < valorCarro;parcela++) {
			double valorParcela = valorCarro / parcela;
			
			if (valorParcela < 1000) {
				System.out.println("Saindo do laço...");
				break;
			}
			System.out.println("Pode parcelar o carro em " + parcela + " vez(es)");
			
		}
	}
}

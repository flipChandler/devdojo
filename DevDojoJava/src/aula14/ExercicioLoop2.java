package aula14;

public class ExercicioLoop2 {
	public static void main(String[] args) {
		// DADO UM VALOR DE UM CARRO, DESCUBRA EM QUANTAS VEZES ELE PODE SER PARCELADO
		//REGRA: AS PARCELAS NÃO PODEM SER MENORES QUE 1000
		
		double valorCarro = 20000;
		for (int parcela = (int)valorCarro; parcela >= 1; parcela--) {
			double valorParcela = valorCarro / parcela;			
			if ( valorParcela <= 1000) {
				continue;
			}			
			System.out.println("Parcela " + parcela + " é R$ " + valorParcela);
			System.out.println("Consumindo memória");			
		}
		
	}
}

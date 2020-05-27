package br.com.felipesantos.javacore.polimorfismo.classes;

public class RelatorioPagamento {
	
	public void pagamentoGerente(Gerente gerente) {
		System.out.println("Gerando relatorio de pagamento para ger�ncia");
		gerente.calcularPagamento();
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Sal�rio desse m�s: " + gerente.getSalario());
		
	}
	
	public void pagamentoVendedor(Vendedor vendedor) {
		System.out.println("Gerando relatorio de pagamento para vendedor");
		vendedor.calcularPagamento();
		System.out.println("Nome: " + vendedor.getNome());
		System.out.println("Sal�rio desse m�s: " + vendedor.getSalario());
		
	}
}

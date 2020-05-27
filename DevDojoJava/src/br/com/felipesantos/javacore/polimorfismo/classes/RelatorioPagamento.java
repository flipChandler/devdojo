package br.com.felipesantos.javacore.polimorfismo.classes;

public class RelatorioPagamento {
	
	public void pagamentoGerente(Gerente gerente) {
		System.out.println("Gerando relatorio de pagamento para gerência");
		gerente.calcularPagamento();
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Salário desse mês: " + gerente.getSalario());
		
	}
	
	public void pagamentoVendedor(Vendedor vendedor) {
		System.out.println("Gerando relatorio de pagamento para vendedor");
		vendedor.calcularPagamento();
		System.out.println("Nome: " + vendedor.getNome());
		System.out.println("Salário desse mês: " + vendedor.getSalario());
		
	}
}

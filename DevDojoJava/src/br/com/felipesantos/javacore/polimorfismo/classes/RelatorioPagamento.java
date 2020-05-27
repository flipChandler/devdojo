package br.com.felipesantos.javacore.polimorfismo.classes;

public class RelatorioPagamento {
	
//	public void pagamentoGerente(Gerente gerente) {
//		System.out.println("Gerando relatorio de pagamento para gerência");
//		gerente.calcularPagamento();
//		System.out.println("Nome: " + gerente.getNome());
//		System.out.println("Salário desse mês: " + gerente.getSalario());
//		
//	}
//	
//	public void pagamentoVendedor(Vendedor vendedor) {
//		System.out.println("Gerando relatorio de pagamento para vendedor");
//		vendedor.calcularPagamento();
//		System.out.println("Nome: " + vendedor.getNome());
//		System.out.println("Salário desse mês: " + vendedor.getSalario());
//		
//	}
	
	// ESSE MÉTODO FUNCIONA PARA GERENTE E VENDEDOR | 
	// QNDO PASSAR O GERENTE, calcularPagamento vai ser chamado de Gerente
	//QNDO PASSAR O VENDEDOR, calcularPagamento vai ser chamado de Vendedor
	public void pagamentoGenerico(Funcionario funcionario) {
		System.out.println("-----Gerando relatorio de pagamento-----");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salário desse mês: " + funcionario.getSalario());
	}
}

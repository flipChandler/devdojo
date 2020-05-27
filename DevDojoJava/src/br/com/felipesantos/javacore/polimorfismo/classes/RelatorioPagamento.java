package br.com.felipesantos.javacore.polimorfismo.classes;

public class RelatorioPagamento {
	
	// ESSE MÉTODO FUNCIONA PARA GERENTE E VENDEDOR | 
	// QNDO PASSAR O GERENTE, calcularPagamento vai ser chamado de Gerente
	//QNDO PASSAR O VENDEDOR, calcularPagamento vai ser chamado de Vendedor
	public void pagamentoGenerico(Funcionario funcionario) {
		System.out.println("-----Gerando relatorio de pagamento-----");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Salário desse mês: " + funcionario.getSalario());
		
		if (funcionario instanceof Gerente) { // se funcionario for uma instancia de Gerente, faça isso
			Gerente gerente = (Gerente) funcionario;
			System.out.println("Participação nos lucros: " + gerente.getParticipacaoNoLucro());
		}
		if (funcionario instanceof Vendedor) { // se funcionario for uma instancia de Vendedor, faça isso
			System.out.println("Total de Vendas: " + ((Vendedor) funcionario).getTotalVendas());			 
		}
		
	}
}

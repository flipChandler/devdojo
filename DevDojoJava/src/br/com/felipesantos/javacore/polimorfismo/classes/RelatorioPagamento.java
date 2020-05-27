package br.com.felipesantos.javacore.polimorfismo.classes;

public class RelatorioPagamento {
	
	// ESSE M�TODO FUNCIONA PARA GERENTE E VENDEDOR | 
	// QNDO PASSAR O GERENTE, calcularPagamento vai ser chamado de Gerente
	//QNDO PASSAR O VENDEDOR, calcularPagamento vai ser chamado de Vendedor
	public void pagamentoGenerico(Funcionario funcionario) {
		System.out.println("-----Gerando relatorio de pagamento-----");
		funcionario.calcularPagamento();
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Sal�rio desse m�s: " + funcionario.getSalario());
		
		if (funcionario instanceof Gerente) { // se funcionario for uma instancia de Gerente, fa�a isso
			Gerente gerente = (Gerente) funcionario;
			System.out.println("Participa��o nos lucros: " + gerente.getParticipacaoNoLucro());
		}
		if (funcionario instanceof Vendedor) { // se funcionario for uma instancia de Vendedor, fa�a isso
			System.out.println("Total de Vendas: " + ((Vendedor) funcionario).getTotalVendas());			 
		}
		
	}
}

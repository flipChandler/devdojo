package br.com.felipesantos.javacore.polimorfismo.test;

import br.com.felipesantos.javacore.polimorfismo.classes.Funcionario;
import br.com.felipesantos.javacore.polimorfismo.classes.Gerente;
import br.com.felipesantos.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.felipesantos.javacore.polimorfismo.classes.Vendedor;

public class PolimorfismoTest {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Milton", 5000, 2000);
		Vendedor vendedor = new Vendedor("Yuri", 2000, 20000);
		RelatorioPagamento relatorio = new RelatorioPagamento();
//		relatorio.pagamentoGerente(gerente);
//		System.out.println("---------------------------------------");
//		relatorio.pagamentoVendedor(vendedor);
		
		relatorio.pagamentoGenerico(gerente);
		System.out.println("-----------------");
		relatorio.pagamentoGenerico(vendedor);
		
		
		Funcionario funcionario = gerente;
		System.out.println("------------------");
		System.out.println(funcionario.getSalario());
	}

}

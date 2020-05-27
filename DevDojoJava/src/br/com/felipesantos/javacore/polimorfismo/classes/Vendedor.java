package br.com.felipesantos.javacore.polimorfismo.classes;

public class Vendedor extends Funcionario {
	private double totalVendas;
	
	public Vendedor(String nome, double salario, double totalVendas) {
		super(nome, salario);
		this.totalVendas = totalVendas;
	}

	@Override
	public void calcularPagamento() {
		this.salario += this.totalVendas * 0.05;
		
	}

}
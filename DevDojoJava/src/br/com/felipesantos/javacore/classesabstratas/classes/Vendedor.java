package br.com.felipesantos.javacore.classesabstratas.classes;

public class Vendedor extends Funcionario {
	private double totalVendas;
	
	public Vendedor() {
		
	}
	
	public Vendedor(String nome, String clt, double salario, double totalVendas) {
		super(nome, clt, salario);
		this.totalVendas = totalVendas;
	}
	
	
	@Override
	public void calcularSalario() {
		this.salario += this.totalVendas * 0.05;
		
	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}






	
	
	
	
	
	
	

}

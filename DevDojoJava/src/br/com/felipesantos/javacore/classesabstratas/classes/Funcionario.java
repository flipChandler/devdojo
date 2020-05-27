package br.com.felipesantos.javacore.classesabstratas.classes;

public abstract class Funcionario extends Pessoa {
	
	protected String clt;
	protected double salario;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String clt, double salario) {
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}
	
	public abstract void calcularSalario();	
	
	public void imprime() {
		System.out.println("dentro do imprime de Funcionario");
	}

	
	public String getClt() {
		return clt;
	}
	public void setClt(String clt) {
		this.clt = clt;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [ nome=" + this.nome +", clt=" + this.clt + ", salario=" + this.salario + "]";
	}
	
	
	
	
}

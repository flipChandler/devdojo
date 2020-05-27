package br.com.felipesantos.javacore.classesabstratas.classes;

public abstract class Funcionario {
	protected String nome;
	protected String clt;
	protected double salario;
	
	public abstract void calcularSalario();	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String clt, double salario) {
		super();
		this.nome = nome;
		this.clt = clt;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
		return "Funcionario [nome=" + nome + ", clt=" + clt + ", salario=" + salario + "]";
	}
	
	
	
	
}

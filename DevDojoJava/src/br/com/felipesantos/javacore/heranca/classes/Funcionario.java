package br.com.felipesantos.javacore.heranca.classes;

public class Funcionario extends Pessoa{ // FUNCIONARIO �-UMA PESSOA
	private double salario;

	public void print() {
		super.print();// m�todo da superclasse Pessoa
		System.out.println("Salario: " + this.salario);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}

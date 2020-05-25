package br.com.felipesantos.javacore.heranca.classes;

public class Funcionario extends Pessoa{ // FUNCIONARIO É-UMA PESSOA
	private double salario;

	public void print() {
		super.print();// método da superclasse Pessoa
		System.out.println("Salario: " + this.salario);
		imprimeReciboPagamento();
	}
	
	public void imprimeReciboPagamento() {
		System.out.println("Eu, " + super.nome + " recebi o pagamento de " + this.salario);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}

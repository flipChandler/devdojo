package br.com.felipesantos.javacore.heranca.classes;

public class Funcionario extends Pessoa{ // FUNCIONARIO É-UMA PESSOA
	private double salario;
	
	{
		System.out.println("Bloco de inicialização do funcionario 1");
	}
	{
		System.out.println("Bloco de inicialização do funcionario 2");
	}
	static{
		System.out.println("Bloco de inicialização static do funcionario ");
	}
	
	public Funcionario(String nome) {
		super(nome);// construtor da superclasse
		System.out.println("Dentro do construtor de funcionario");
	}

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

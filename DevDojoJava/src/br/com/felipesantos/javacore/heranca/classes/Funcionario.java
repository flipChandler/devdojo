package br.com.felipesantos.javacore.heranca.classes;

public class Funcionario extends Pessoa{ // FUNCIONARIO �-UMA PESSOA
	private double salario;
	
	{
		System.out.println("Bloco de inicializa��o do funcionario 1");
	}
	{
		System.out.println("Bloco de inicializa��o do funcionario 2");
	}
	static{
		System.out.println("Bloco de inicializa��o static do funcionario ");
	}
	
	public Funcionario(String nome) {
		super(nome);// construtor da superclasse
		System.out.println("Dentro do construtor de funcionario");
	}

	public void print() {
		super.print();// m�todo da superclasse Pessoa
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

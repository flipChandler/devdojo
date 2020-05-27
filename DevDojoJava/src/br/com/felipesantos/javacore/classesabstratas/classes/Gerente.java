package br.com.felipesantos.javacore.classesabstratas.classes;

public class Gerente extends Funcionario {
	public Gerente() {
		
	}
	
	public Gerente(String nome, String clt, double salario) {
		super(nome, clt, salario);
	}

	@Override
	public void calcularSalario() {
		this.salario = this.salario * (1 + 0.20);
		
	}
	
}

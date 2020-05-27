package br.com.felipesantos.javacore.polimorfismo.classes;

public class Gerente extends Funcionario {
	private double participacaoNoLucro;
	
	public Gerente(String nome, double salario, double pnl) {
		super(nome, salario);
		this.participacaoNoLucro = pnl;
	}

	public double getParticipacaoNoLucro() {
		return participacaoNoLucro;
	}

	public void setParticipacaoNoLucro(double participacaoNoLucro) {
		this.participacaoNoLucro = participacaoNoLucro;
	}

	@Override
	public void calcularPagamento() {
		this.salario += this.participacaoNoLucro;
		
	}
	
	

}

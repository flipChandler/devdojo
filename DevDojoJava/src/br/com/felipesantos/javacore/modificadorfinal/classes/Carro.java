package br.com.felipesantos.javacore.modificadorfinal.classes;

public final class Carro { // N�O PODE SER ESTENDIDA
	public static final double VELOCIDADE_FINAL = 250;
	public final Comprador comprador = new Comprador();
	private String nome;
	private String marca;
	
	
	public final void imprime() {// n�o pode sobrescrever esse m�todo
		
	}
	
	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Comprador getComprador() {
		return comprador;
	}
	
	

	
	
	
}

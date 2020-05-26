package br.com.felipesantos.javacore.modificadorfinal.classes;

public final class Carro { // NÃO PODE SER ESTENDIDA
	public static final double VELOCIDADE_FINAL = 250;
	public final Comprador comprador = new Comprador();
	private String nome;
	private String marca;
	
	
	public final void imprime() {// não pode sobrescrever esse método
		
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

package br.com.felipesantos.javacore.optional.classes;

public class Seguradora {
	private String nome;
	
	public Seguradora() {
		
	}
	
	public Seguradora(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Seguradora [nome=" + nome + "]";
	}
	
	
	
	
}

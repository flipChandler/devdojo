package br.com.felipesantos.javacore.enum_.classes;

public class Cliente {
	private String nome;	
	private TipoCliente tipo;
	
	
	
	public Cliente(String nome, TipoCliente tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipo() {
		return tipo;
	}
	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + ", tipo=" + tipo;
	}
	
	
	
		
	
	
}

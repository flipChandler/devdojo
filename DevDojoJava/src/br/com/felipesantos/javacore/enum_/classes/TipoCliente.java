package br.com.felipesantos.javacore.enum_.classes;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa Física"),
	PESSOA_JURIDICA(2, "Pessoa Jurídica");
	
	private int tipo;
	private String nome;
	
	TipoCliente(int tipo, String nome){
		this.tipo = tipo;
		this.nome = nome;
	}
	
	//constant specific class body
	
	public String getId() {
		return "A";
	}
	
	public int getTipo() {
		return this.tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	

}

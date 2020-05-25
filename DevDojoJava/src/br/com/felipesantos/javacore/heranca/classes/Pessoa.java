package br.com.felipesantos.javacore.heranca.classes;

public class Pessoa {
	// protected -> visibilidade: classes filhas ou do mesmo pacote
	protected String nome;
	protected String cpf;
	protected Endereco endereco;
	
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	public Pessoa (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	
	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		endereco.printEndereco();		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}

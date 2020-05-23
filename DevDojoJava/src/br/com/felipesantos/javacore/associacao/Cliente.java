package br.com.felipesantos.javacore.associacao;

public class Cliente {
	private String nome;
	private String rg;
	private String cpf;
	private char sexo;
	private int idade;
	private Endereco endereco;
	
	public Cliente() {
		this.endereco = new Endereco();
	}
	
	public Cliente(String nome, String rg, String cpf, char sexo, int idade, Endereco end) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
		this.endereco = end;
	}
	
	public Cliente(String nome, String rg, String cpf, char sexo, int idade) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	
	public String imprimirDados() {
		return "Nome: " + this.nome + "\nRG: " + this.rg + "\nCPF: "+ this.cpf +
				"\nSexo: " + this.sexo + "\nIdade: " + this.idade +
				"\nEndereço: " + endereco.imprimirEndereco();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}

package br.com.felipesantos.javacore.associacao.exercicio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public Seminario[] getSeminarios() {
		return seminarios;
	}
	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}
	
	
	
	
}

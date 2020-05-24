package br.com.felipesantos.javacore.associacao.exercicio;

public class Aluno {
	private String nome;
	private int idade;	
	private Seminario seminario;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int idade) {		
		this.nome = nome;
		this.idade = idade;
	}
	
	public void print() {
		System.out.println("-----------RELATORIO DE ALUNOS------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		
		if(this.seminario != null) {
			System.out.println("Semin�rio inscrito: " + this.seminario.getTitulo());
		}else {
			System.out.println("Aluno n�o est� inscrito em nenhum semin�rio");
		}
			
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Seminario getSeminario() {
		return seminario;
	}
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	
	
	
}

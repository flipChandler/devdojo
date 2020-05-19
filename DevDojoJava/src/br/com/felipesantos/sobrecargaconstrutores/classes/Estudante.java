package br.com.felipesantos.sobrecargaconstrutores.classes;

public class Estudante {
	
	private String matricula;
	private String nome;
	private double[] notas;
	private String dataMatricula;
	
	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public Estudante(String matricula, String nome, double[] notas, String dataMatricula) {
		this();// chma o contrutor sem args
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
		this.dataMatricula = dataMatricula;
	}
	
	
	public Estudante() {
		System.out.println("Contrutor default");
	}
	
	public void imprimeDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		for (double nota : notas) {
			System.out.println("Notas: " + nota);
		}
	}
	
	public String getMatricula() {
		
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
}

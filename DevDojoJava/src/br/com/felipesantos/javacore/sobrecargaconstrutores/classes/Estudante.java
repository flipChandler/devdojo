package br.com.felipesantos.javacore.sobrecargaconstrutores.classes;

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
		this(matricula, nome, notas);// chama o contrutor com 3 args
		this.dataMatricula = dataMatricula;
	}

	public Estudante() {

	}

	public void imprimeDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matricula: " + this.matricula);
		for (double nota : notas) {
			System.out.println("Notas: " + nota);
		}
		System.out.println("Data da Matricula: " + this.dataMatricula);
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

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	

}

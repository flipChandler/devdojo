package br.com.felipesantos.javacore.modificadorestatico.classes;

public class Carro {
	private String nome;
	private double velocidadeMaxima;
	private static double velocidadeLimite = 240;
	
	// atributos static pertencem à classe e não ao objeto
	
	public void imprimeDados() {
		System.out.println("--------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade Limite:" + velocidadeLimite);
	}
	
	
	public Carro(String nome, double velocidadeMaxima) {
		super();
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public Carro() {
		
	}
	
	public static void setVelocidadeLimite(double velocidadeLimite) {
		Carro.velocidadeLimite = velocidadeLimite;
	}
	
	public static double getVelocidadeLimite() {
		return velocidadeLimite;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	

	
}

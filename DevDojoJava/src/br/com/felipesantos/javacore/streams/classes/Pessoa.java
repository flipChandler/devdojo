package br.com.felipesantos.javacore.streams.classes;

import java.util.Arrays;
import java.util.List;

public class Pessoa {
	private String nome;
	private int idade;
	private double salario;
	
	private Pessoa(String nome, int idade, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public static List<Pessoa> bancoDePessoas() {
		return Arrays.asList(
				new Pessoa("Felipe dos Santos", 33, 2000),
				new Pessoa("Jason Sthatan", 52, 4000),
				new Pessoa("Angelina Jolie", 36, 8092),
				new Pessoa("Brad Pitt", 63, 12000),
				new Pessoa("Mel Lisboa", 41, 2600),
				new Pessoa("Eva Mendes", 39, 4300),
				new Pessoa("Mia Khalifa", 36, 5740),
				new Pessoa("Mila Kunis", 37, 9000),
				new Pessoa("Natalie Portman", 40, 12000),
				new Pessoa("Josiani Garcia", 33, 3600),
				new Pessoa("Suzi Rego", 60, 1900),
				new Pessoa("Josh Lawrence", 24, 2000),
				new Pessoa("Johnny Cash", 83, 21000)
				);
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
}

package br.com.felipesantos.javacore.introducaometodos.classes;

public class Professor {
	public String nome;
	public String matricula;
	public String rg;
	public String cpf;
	
	public void imprimeSeusDados() {
		// this -> valores do proprio objeto que está chamando
		System.out.println(this.nome);
		System.out.println(this.matricula);
		System.out.println(this.rg);
		System.out.println(this.cpf);
	}
	
}

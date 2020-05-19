package br.com.felipesantos.aula27.introducaometodos.classes;

public class Estudante {
	public String nome;
	public int idade;
	public double[] notas;
	
	public void imprimeDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.print("Notas: ");
		
		if(notas != null) {
			for (double nota : notas) {			
				System.out.print(nota + " ");
			}
		}
		
		
	}
	
	public void tirarMedia() {
		if (notas == null) {
			System.out.println("Esse aluno não possui notas!");
			return; // break em if/else statements
		}		
		double media = 0;
		
		for (double nota : notas) {
			media += nota;
		}		
		media /= notas.length;
		
		if (media > 6) {
			System.out.println("\nA média é " + media + " situação: Aprovado");
			return; // funciona como break em if/else statement
		}
		
		System.out.println("\nSituação: Reprovado");			
		
	}
}

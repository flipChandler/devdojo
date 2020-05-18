package br.com.felipesantos.aula27.introducaometodos.test;

import br.com.felipesantos.aula27.introducaometodos.classes.Professor;

public class ProfessorTest2 {

	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.cpf = "1111111";
		prof.matricula = "4444444";
		prof.nome = "Tom";
		prof.rg = "333333";
		
		Professor prof2 = new Professor();
		prof2.cpf = "7777777";
		prof2.matricula = "5555555";
		prof2.nome = "Shania";
		prof2.rg = "99999999";
		
		prof.imprimeSeusDados();
		System.out.println("--------PULA LINHA--------------");
		prof2.imprimeSeusDados();
		
		
		

	}

}

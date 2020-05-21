package br.com.felipesantos.javacore.introducaoclasses.test;

import br.com.felipesantos.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {

	public static void main(String[] args) {
		Professor girafales = new Professor();
		girafales.nome = "Girafales";
		girafales.matricula ="145632";
		girafales.rg ="429804587";
		girafales.cpf = "151589638-51";
		
		Professor raimundo = new Professor();
		raimundo.nome = "Raimundo";
		raimundo.matricula ="145632";
		raimundo.rg ="14879655";
		raimundo.cpf = "789654564";
		
		girafales = raimundo; // girafales perde toda a referencia adquirida acima (GARBAGE COLLECTOR) imprimindo os dados de raimundo
		
		System.out.println(girafales.nome);
		System.out.println(girafales.matricula);
		System.out.println(girafales.rg);
		System.out.println(girafales.cpf);
		
		System.out.println("---------------------------");
		
		
		
		System.out.println(raimundo.nome);
		System.out.println(raimundo.matricula);
		System.out.println(raimundo.rg);
		System.out.println(raimundo.cpf);

	}

}

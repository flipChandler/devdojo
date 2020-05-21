package br.com.felipesantos.javacore.sobrecargametodos.test;

import br.com.felipesantos.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Chica da Silva", "1545698789", 4500, "896325456");
		Funcionario funcionario2 = new Funcionario();		
		
		funcionario1.imprimeDados();
		funcionario2.imprimeDados();
	}

}

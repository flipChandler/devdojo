package br.com.felipesantos.sobrecargametodos.test;

import br.com.felipesantos.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.init("Chica da Silva", "1545698789", 4500, "896325456");
		
		funcionario.imprimeDados();
		

	}

}

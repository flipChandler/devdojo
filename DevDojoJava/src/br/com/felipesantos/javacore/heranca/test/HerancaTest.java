package br.com.felipesantos.javacore.heranca.test;

import br.com.felipesantos.javacore.heranca.classes.Endereco;
import br.com.felipesantos.javacore.heranca.classes.Funcionario;
import br.com.felipesantos.javacore.heranca.classes.Pessoa;

public class HerancaTest {

	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa("Regina");
		Endereco endereco = new Endereco();
		
		//pessoa.setCpf("123456789");
		endereco.setRua("Rua Jo�o das Couves");
		endereco.setBairro("Parque Monjolo");
		//pessoa.setEndereco(endereco);		
		//pessoa.print();
		
		System.out.println("-------------------");
		
		Funcionario funcionario = new Funcionario("Bruna");
		funcionario.setCpf("78963654");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(4500);
		//funcionario.print();
		

	}

}

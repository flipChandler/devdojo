package br.com.felipesantos.javacore.heranca.test;

import br.com.felipesantos.javacore.heranca.classes.Endereco;
import br.com.felipesantos.javacore.heranca.classes.Funcionario;
import br.com.felipesantos.javacore.heranca.classes.Pessoa;

public class HerancaTest {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		
		pessoa.setNome("Regina");
		pessoa.setCpf("123456789");
		endereco.setRua("Rua João das Couves");
		endereco.setBairro("Parque Monjolo");
		pessoa.setEndereco(endereco);		
		pessoa.print();
		
		System.out.println("-------------------");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Bruna");
		funcionario.setCpf("78963654");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(4500);
		funcionario.print();
		

	}

}

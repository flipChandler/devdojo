package br.com.felipesantos.javacore.associacao;

import java.util.Scanner;

public class AppClienteEndereco {

	// ASSOCIACAO CLIENTE TEM-UM ENDERECO
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scannerString = new Scanner(System.in);
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		
		System.out.println("Digite o seu nome: ");
		cliente.setNome(scannerString.nextLine());
		
		System.out.println("Digite o seu RG:");
		cliente.setRg(scannerString.nextLine());
		
		System.out.println("Digite o seu cpf: ");
		cliente.setCpf(scannerString.nextLine());
		
		System.out.println("Digite o seu sexo [M] ou [F]: ");
		cliente.setSexo(scannerString.next().charAt(0));

		System.out.println("Digite a sua idade: ");
		cliente.setIdade(scanner.nextInt());
		
		System.out.println("Digite o nome da sua rua: ");
		endereco.setRua(scanner.next());
		
		System.out.println("Digite o numero da sua casa: ");
		endereco.setNumero(scanner.nextInt());
		
		System.out.println("Digite o bairro onde vc mora: ");
		endereco.setBairro(scanner.next());
		
		System.out.println("Digite o complemento da sua casa: ");
		endereco.setComplemento(scanner.next());
		
		System.out.println("Digite a cidade onde vc mora: ");
		endereco.setCidade(scanner.next());
		
		// associacao acontece aqui
		cliente.setEndereco(endereco);		
		
		System.out.println("Dados do cliente \n" + cliente.imprimirDados());
		
		

	}

}

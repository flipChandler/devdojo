package br.com.felipesantos.javacore.jdbc.test;

import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;

import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.db.CompradorDAO;

public class TesteCrud {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {		
		
		int opcao;
		while(true) {
			menu();
			opcao = Integer.parseInt(scanner.nextLine());
			if (opcao == 0) {
				out.println("Saindo do sistema...");
				break;
			}
			
			if (opcao == 1) {
				menuComprador();
				opcao = Integer.parseInt(scanner.nextLine());
				CompradorCRUD.executar(opcao);
			}
			
			if (opcao == 2) {
				menuCarro();
				opcao = Integer.parseInt(scanner.nextLine());
				CarroCRUD.executar(opcao);				
			}
		}

	}
	
	private static void menu() {
		out.println("Selecione uma opção:");
		out.println("[1] Comprador");
		out.println("[2] Carro");
		out.println("[0] Sair...");
		
	}
	
	private static void menuComprador() {
		out.println("Digite a opção para começar");
		out.println("1 - Inserir Comprador");
		out.println("2 - Atualizar Comprador");
		out.println("3 - Listar todos os compradores");
		out.println("4 - Buscar Comprador pelo nome");
		out.println("5 - Deletar Comprador");
		out.println("9 - Voltar...");
	}

	private static void menuCarro() {
		out.println("Digite a opção para começar");
		out.println("1 - Inserir Carro");
		out.println("2 - Atualizar Carro");
		out.println("3 - Listar todos os Carros");
		out.println("4 - Buscar Carro pelo nome");
		out.println("5 - Deletar Carro");
		out.println("9 - Voltar...");
	}
	
	
	
	
}

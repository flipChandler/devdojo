package br.com.felipesantos.javacore.jdbc.test;

import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;

import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.db.CompradorDAO;

public class TesteCrud {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {		
		
		int op;
		while(true) {
			menu();
			op = Integer.parseInt(scanner.nextLine());
			if (op == 0) {
				out.println("Saindo do sistema...");
				break;
			}
			executar(op);
		}

	}
	
	private static void menu() {
		out.println("Digite a opção para começar");
		out.println("1 - Inserir Comprador");
		out.println("2 - Atualizar Comprador");
		out.println("3 - Listar todos os compradores");
		out.println("4 - Buscar Comprador pelo nome");
		out.println("5 - Deletar Comprador");
		out.println("0 - Sair...");
	}
	
	public static void executar(int op) {
		switch(op) {
			case 1:
				inserir();
				break;
			case 2:
				atualizar();
				break;			
			case 3:
				listar();
				break;
			case 4:
				System.out.println("Digite o nome a ser pesquisado: ");
				buscarPorNome(scanner.nextLine());
				break;
			case 5:
				deletar();
				break;
		}
	}
	
	
	private static void inserir() {
		Comprador comprador = new Comprador();
		out.println("Nome: ");
		comprador.setNome(scanner.nextLine());
		out.println("CPF: ");
		comprador.setCpf(scanner.nextLine());
		CompradorDAO.save(comprador);
	}
	
	private static void atualizar() {
		out.println("Selecione um dos compradores abaixo:");
		List<Comprador> compradorList = listar();
		Comprador comprador = compradorList.get(Integer.parseInt(scanner.nextLine()));
		
		out.println("Novo nome ou ENTER para manter o mesmo");
		String nome = scanner.nextLine();
		out.println("Novo cpf ou ENTER para manter o mesmo");
		String cpf = scanner.nextLine();	
		
		if (!nome.isEmpty()) {
			comprador.setNome(nome);
		}
		if (!cpf.isEmpty()) {
			comprador.setCpf(cpf);
		}
		
		CompradorDAO.update(comprador);
		
	}
	
	private static List<Comprador> listar() {
		List<Comprador> compradorList = CompradorDAO.selectAll();
		for (int i = 0; i < compradorList.size(); i++) {
			Comprador comprador = compradorList.get(i);
			out.println("|" + i + "|" + comprador.getNome() + " " + comprador.getCpf());
		}
		return compradorList;
	}
	
	private static void buscarPorNome(String nome) {
		List<Comprador> compradorList = CompradorDAO.findByName(nome);
		for (int i = 0; i < compradorList.size(); i++) {
			Comprador comprador = compradorList.get(i);
			out.println("|" + i + "|" + comprador.getNome() + " " + comprador.getCpf());
		}
	}
	
	public static void deletar() {
		System.out.println("Selecione um dos compradores para deletar");
		List<Comprador> compradorList = listar();
		int index = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Tem certeza? S/N");
		String opcao = scanner.nextLine();
		if (opcao.startsWith("s")) {
			CompradorDAO.delete(compradorList.get(index));
		}
	}

}

package br.com.felipesantos.javacore.jdbc.test;

import static java.lang.System.out;

import java.util.List;
import java.util.Scanner;

import br.com.felipesantos.javacore.jdbc.CarroDAO;
import br.com.felipesantos.javacore.jdbc.classes.Carro;
import br.com.felipesantos.javacore.jdbc.classes.Comprador;
import br.com.felipesantos.javacore.jdbc.db.CarroDAOImpl;

public class CarroCRUD {
	private static Scanner scanner = new Scanner(System.in);  
	// se quiser usar um CRUD NoSQL, é só CarroDAO (interface) receber CarroDAONoSQLImpl que o codigo não quebra
	private static CarroDAO carroDAO = new CarroDAOImpl();
	
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
		Carro carro = new Carro();
		out.println("Nome: ");
		carro.setNome(scanner.nextLine());
		out.println("Placa: ");
		carro.setPlaca(scanner.nextLine());
		
		out.println("Selecione um dos compradores abaixo: ");
		List<Comprador> compradorList = CompradorCRUD.listar();
		int index = Integer.parseInt(scanner.nextLine());
		
		carro.setComprador(compradorList.get(index));
		
		carroDAO.save(carro);
	}
	
	private static void atualizar() {
		out.println("Selecione um dos carros abaixo:");
		List<Carro> carroList = listar();
		Carro carro = carroList.get(Integer.parseInt(scanner.nextLine()));
		
		out.println("Novo nome ou ENTER para manter o mesmo");
		String nome = scanner.nextLine();
		out.println("Nova placa ou ENTER para manter o mesmo");
		String placa = scanner.nextLine();	
		
		if (!nome.isEmpty()) {
			carro.setNome(nome);
		}
		if (!placa.isEmpty()) {
			carro.setPlaca(placa);
		}
		
		carroDAO.update(carro);
		
	}
	
	public static List<Carro> listar() {
		List<Carro> carroList = carroDAO.selectAll();
		for (int i = 0; i < carroList.size(); i++) {
			Carro carro = carroList.get(i);
			out.println("|" + i + "|" + carro.getNome() + " " + carro.getPlaca() + " " + carro.getComprador().getNome());
		}
		return carroList;
	}
	
	private static void buscarPorNome(String nome) {
		List<Carro> carroList = carroDAO.findByName(nome);
		for (int i = 0; i < carroList.size(); i++) {
			Carro carro = carroList.get(i);
			out.println("|" + i + "|" + carro.getNome() + " " + carro.getPlaca() + " " + carro.getComprador().getNome());
		}
	}
	
	public static void deletar() {
		System.out.println("Selecione um dos carros abaixo para deletar");
		List<Carro> carroList = listar();
		int index = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Tem certeza? S/N");
		String opcao = scanner.nextLine();
		if (opcao.startsWith("s")) {
			carroDAO.delete(carroList.get(index));
		}
	}


}

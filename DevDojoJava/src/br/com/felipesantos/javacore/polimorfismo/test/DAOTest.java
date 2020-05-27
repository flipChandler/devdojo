package br.com.felipesantos.javacore.polimorfismo.test;

import java.util.LinkedList;
import java.util.List;

import br.com.felipesantos.javacore.polimorfismo.classes.ArquivoDAOImpl;
import br.com.felipesantos.javacore.polimorfismo.classes.GenericDAO;

public class DAOTest {

	public static void main(String[] args) {
		GenericDAO arquivoDAO = new ArquivoDAOImpl();
		arquivoDAO.save();
		
		//List<String> lista = new ArrayList<>();
		List<String> lista = new LinkedList<>();
		lista.add("Joana");
		lista.add("Brad");
		lista.add("Samuel");
		lista.add("Monica");
		
		for (String nome : lista) {
			System.out.println(nome);
		}
	}

}

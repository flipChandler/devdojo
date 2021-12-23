package br.com.felipesantos.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoListTest {

	public static void main(String[] args) {
		
		List<Gato> gatos = new ArrayList<>() {{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "tigrado"));
			add(new Gato("Jon", 12, "amarelo"));
		}};
		
		System.out.println(gatos);
		
		System.out.println("---Ordem de Inserção---");
		System.out.println(gatos);
		
		System.out.println("---Ordem Aleatória---");
		Collections.shuffle(gatos);
		System.out.println(gatos);
		
		System.out.println("---Ordem Natural (Nome)---");
		Collections.sort(gatos);
		System.out.println(gatos);
		
	}

}


class Gato implements Comparable<Gato> {
	
	private String nome;
	private Integer idade;
	private String cor;	
	
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}
	@Override
	public int compareTo(Gato gato) {
		// coloca em ordem alfabetica
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}	
}

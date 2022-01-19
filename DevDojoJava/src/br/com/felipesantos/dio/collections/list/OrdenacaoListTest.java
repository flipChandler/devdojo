package br.com.felipesantos.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		
		System.out.println("---Ordem por Idade (Collections)---");
		Collections.sort(gatos, new ComparatorIdade());
		System.out.println(gatos);
		
		System.out.println("---Ordem por Idade (objeto de List)---");
		gatos.sort(new ComparatorIdade());
		System.out.println(gatos);
		
		System.out.println("---Ordem por Cor (Collections)---");
		Collections.sort(gatos, new ComparatorCor());
		System.out.println(gatos);
		
		System.out.println("---Ordem por Cor (objeto de List)---");
		gatos.sort(new ComparatorCor());
		System.out.println(gatos);	
		
		System.out.println("---Ordem por Nome/Cor/Idade (objeto de List)---");
		gatos.sort(new ComparatorNomeCorIdade());
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


class ComparatorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {		
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
	
}

class ComparatorCor implements Comparator<Gato> {

	@Override
	public int compare(Gato gato1, Gato gato2) {		
		return gato1.getCor().compareToIgnoreCase(gato2.getCor());
	}
	
	// cor1 == cor2 return  0 
	// cor1 > cor2  return  1
	// cor1 < cor2  return -1
}


class ComparatorNomeCorIdade implements Comparator<Gato> {

	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if (nome != 0) { // se for 1 ou -1, ordene pelo nome
			return nome;
		}
		
		// se caiu aqui é pq nome1 é igual nome2 | nome = 0
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) { // se for 1 ou -1, ordene pela cor
			return cor;
		}
		
		// se caiu aqui é pq nome e cor são iguais | nome = 0 && cor = 0
		return Integer.compare(g1.getIdade(), g2.getIdade()); // // se for 1 ou -1, ordene pela idade
	}	
}


/* 
1) Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).


2) Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"

"Esteve no local do crime?"

"Mora perto da vítima?"

"Devia para a vítima?"

"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".

https://github.com/cami-la/curso-dio-intro-collections (gabarito)

 */




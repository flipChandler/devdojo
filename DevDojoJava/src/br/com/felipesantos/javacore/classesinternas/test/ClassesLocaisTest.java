package br.com.felipesantos.javacore.classesinternas.test;

public class ClassesLocaisTest {
	private String nome = "Felipe dos Santos";
	
	// fazAlgumaCoisa só executa o metodo imprimeNomeExterno se houver um objeto de Interna instanciado dentro 
	public void fazAlgumaCoisa() {
		class Interna {
			public void imprimeNomeExterno() {
				System.out.println(nome);
			}
		}
		
		Interna interna = new Interna();
		interna.imprimeNomeExterno();
	}
	
	
	public static void main(String[] args) {
		ClassesLocaisTest externa = new ClassesLocaisTest();
		externa.fazAlgumaCoisa();
	}

}

package br.com.felipesantos.javacore.classesinternas.test;

class Externa {
	static class Interna {
		public void imprimir() {
			System.out.println("imprimindo.......");
		}
	}
}

public class ClassesInternasEstaticas {

	public static void main(String[] args) {
		Externa.Interna teste = new Externa.Interna();
		teste.imprimir();
		
		Interna2 interna2 = new Interna2();
		interna2.imprimir();		

	}
	
	static class Interna2 {
		public void imprimir() {
			System.out.println("imprimindo dentro do interna 2.........");
		}
	}

}

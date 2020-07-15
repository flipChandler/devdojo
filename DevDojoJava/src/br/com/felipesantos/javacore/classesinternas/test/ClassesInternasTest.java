package br.com.felipesantos.javacore.classesinternas.test;

public class ClassesInternasTest {
	
	private String nome = "Felipe Santos";

	class Interna{
		public void verClasseExterna() {
			System.out.println(nome);
			System.out.println(this); // refere-se a atributo da propria inner class
			System.out.println(ClassesInternasTest.this); // refere-se ao atributo da Classe externa
		}
	}
	
	
	
	public static void main(String[] args) {
		ClassesInternasTest externa = new ClassesInternasTest();
		ClassesInternasTest.Interna interna = externa.new Interna();
		interna.verClasseExterna();
		
		System.out.println("-----------------------------------------------");
		
		ClassesInternasTest.Interna interna2 = new ClassesInternasTest().new Interna();
		interna2.verClasseExterna();
	}

}

//class Externa {
//	private String nome = "Felipe Santos";
//	
//	class Interna {
//		public void verClasseExterna() {
//			System.out.println(nome);
//		}
//	}
//}

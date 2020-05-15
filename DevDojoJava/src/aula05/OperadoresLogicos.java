package aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int idade = 18;
		float salario = 5000.03f;
		
		System.out.println(idade >= 18 && salario >= 1000); // true
		System.out.println(idade >= 33 || salario >= 1000); // true
		System.out.println(idade >= 33 || salario <= 1000); // true
		

	}

}

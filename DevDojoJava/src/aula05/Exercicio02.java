package aula05;

public class Exercicio02 {

	public static void main(String[] args) {
		String nome = "Felipe";
		char sexo = 'M';
		byte idade = 33;
		String estadoCivil = "solteiro";
		float salario = 15350.23f;
		
		System.out.printf("O trabalhador %s, do sexo %c, idade %d, estado civil %s e salario %.2f"
				+ " encontra-se empregado neste estabelecimento", nome, sexo, idade, estadoCivil, salario);

	}

}

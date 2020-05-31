package br.com.felipesantos.javacore.assertions.test;

public class AssertTest {

	public static void main(String[] args) {
		calcularSalario(-2000);
	}
	
	private static void calcularSalario(double salario) {
		//usar o assert true, false somente em metodos privados, conforme as boas práticas
		// verificar enableassertions no eclipse
		assert (salario > 0); // se menor que zero, tem algo muito errado com o seu programa
		// calculo de salário
		
		
//      salario sempre vai ser maior que zero, é perda de performance compilar o else
//		if(salario > 0) {
//			//fazer o calculo com salario
//		}else {
//			System.out.println("Se chegou aqui, ferrou");
//		}
	}
	
	public static void calcularSalario2(double salario) {
		if(salario < 0) {
			throw new IllegalArgumentException();
		}
	}
	
	public static void diasDaSemana(int dia) {
		switch(dia) {
		case 1: break;
		case 2: break;
		case 3: break;
		case 4: break;
		case 5: break;
		case 6: break;
		case 7: break;
		default: assert false; // pode usar em metodo publico, pois, nisso vc tem certeza
		}
	}
}

package br.com.felipesantos.javacore.javadefault.classes;

import br.com.felipesantos.javacore.javadefault.interfaces.A;
import br.com.felipesantos.javacore.javadefault.interfaces.B;

public class C implements A, B {
	// uma classe sempre vai ter prioridade sobre uma interface
	// quando tiver subinterfaces, o método mais específico será utilizado | o default de B foi utilizado
	//
	public static void main(String[] args) {
		new C().oi(); // dentro de oi de B

	}

}

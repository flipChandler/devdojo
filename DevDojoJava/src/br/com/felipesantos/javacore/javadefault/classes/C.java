package br.com.felipesantos.javacore.javadefault.classes;

import br.com.felipesantos.javacore.javadefault.interfaces.A;
import br.com.felipesantos.javacore.javadefault.interfaces.B;
import br.com.felipesantos.javacore.javadefault.interfaces.D;

public class C extends D implements A, B {
	// uma classe sempre vai ter prioridade sobre uma interface
	// quando tiver subinterfaces, o método mais específico será utilizado | o default de B foi utilizado
	// quando houver ambiguidade, o método tem que ser chamado direto pelo super da interface
	public static void main(String[] args) {
		new C().oi(); // dentro de oi de B | quando C extends D é dentro de oi de D extends A

	}
	
	public void oi() {
		B.super.oi();// no exemplo em que B não implements A && C implements A, B | o metodo que tem que ser chamado direto pelo super
	}

}

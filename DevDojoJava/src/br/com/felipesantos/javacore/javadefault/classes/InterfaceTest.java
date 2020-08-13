package br.com.felipesantos.javacore.javadefault.classes;

import br.com.felipesantos.javacore.javadefault.interfaces.MyList;

public class InterfaceTest implements MyList{
	public static void main(String[] args) {
		MyList.sort();
		new InterfaceTest().remove(); // remove() -> método de MyList
	}

	
	// se   tem um método abstrato na interface, esse método tem que ser sobrescrito na classe implementada
	@Override
	public void add() {
		System.out.println("dentro do add");
		
	}
	
	
}

package br.com.felipesantos.modificadorestatico.test;

import br.com.felipesantos.modificadorestatico.classes.Carro;

public class CarroTest {

	public static void main(String[] args) {
		Carro.setVelocidadeLimite(220);
		System.out.println(Carro.getVelocidadeLimite());
		
		Carro carro1 = new Carro("BMW", 280);
		Carro carro2 = new Carro("Audi", 275);
		Carro carro3 = new Carro("Mercedes", 290);
		
		carro1.imprimeDados();
		carro2.imprimeDados();
		carro3.imprimeDados();
		
		System.out.println("#################");
		
		
		carro1.imprimeDados();
		carro2.imprimeDados();
		carro3.imprimeDados();
		

	}

}

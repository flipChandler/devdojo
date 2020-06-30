package br.com.felipesantos.javacore.colecoes.classes;

public class Celular {
	private String nome;
	private String IMEI;
	
	
	public Celular(String nome, String iMEI) {
		super();
		this.nome = nome;
		IMEI = iMEI;
	}
	
	//metodo equals tem que ser 
	//reflexivo -> x.equals(x) tem que ser true, para tudo o que for diferente de null
	//simetrico -> para se y diferente de null, se e.equals(y) == true, logo y.equlas(x) tem que ser true
	//transitividade -> para x, y, z diferentes de null, se x.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true, logo y.equals(z) == true 
	//consistente -> x.equals(y) deve sempre retornar o mesmo valor
	//para x diferente de null, x.equals(null) tem que retornar false
	
	
	@Override
	public boolean equals(Object obj) {// this = x e obj = y
		if (obj == null) return false; 
		if (this == obj) return true; // msm endereço de memória | referencias iguais
		if (this.getClass() != obj.getClass()) return false; // se os tipos de x e y são diferentes
		Celular outroCelular = (Celular) obj;
		return IMEI != null && IMEI.equals(outroCelular.getIMEI());	// se os IMEI's forem iguais, retorne true	
		
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
	
	
}

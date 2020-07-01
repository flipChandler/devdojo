package br.com.felipesantos.javacore.colecoes.classes;

// precisa implementar Comparable para o Collections fazer a ordenação de Produto
public class Produto implements Comparable<Produto> {
	private String serialNumber;
	private String nome;
	private Double preco;
	
		
	public Produto(String serialNumber, String nome, double preco) {
		super();
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
	}

	// sobrescrita do método de Comparable
	//* para que a ordenação (sort) seja feita pelo serialNumber
	//** para que a ordenação (sort) seja feita pelo nome
	//*** para que a ordenação (sort) seja feita pelo preco | preco tem que ser Double e não double
	@Override
	public int compareTo(Produto outroObjeto) {
		return this.serialNumber.compareTo(outroObjeto.getSerialNumber()); //*
		//return this.nome.compareTo(outroObjeto.getNome());  //**
		//return this.preco.compareTo(outroObjeto.getPreco()); //***
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}
	
	
	
	@Override
	public String toString() {
		return "Produto [serialNumber=" + serialNumber + ", nome=" + nome + ", preco=" + preco + "]";
	}

	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	

}

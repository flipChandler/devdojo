package br.com.felipesantos.javacore.associacao.siabreutec;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String complemento;
	private String cidade;
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
			
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String imprimirEndereco() {
		return this.rua + ", " + this.numero + ", " + this.bairro
				+"\nComplemento: "	+ this.complemento + "\nCidade: " + this.cidade;
	}
	
	

}

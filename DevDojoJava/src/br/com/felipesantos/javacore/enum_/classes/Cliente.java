package br.com.felipesantos.javacore.enum_.classes;

public class Cliente {
	public enum TipoPagamento{
		A_VISTA, A_PRAZO
	}
	
	private String nome;	
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;	
	
	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		super();
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}	

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + ", Tipo=" + tipoCliente.getNome() + ", Tipo Pagamento=" + tipoPagamento;
	}	
	
}

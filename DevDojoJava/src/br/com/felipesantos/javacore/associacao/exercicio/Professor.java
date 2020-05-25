package br.com.felipesantos.javacore.associacao.exercicio;

public class Professor {
	private String nome;
	private String especialidade;
	private Seminario[] seminarios;

	private Professor() {

	}

	public Professor(String nome, String especialidade) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public void print() {
		System.out.println("------------RELATORIO DE PROFESSORES------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Especialidade: " + this.especialidade);
		if (seminarios != null && seminarios.length != 0) {
			System.out.println("Seminários participantes: ");
			for (Seminario seminario : seminarios) {
				System.out.println(seminario.getTitulo());
			}
			return; // UMA FORMA PARA NÃO UTILIZAR O ELSE
		}
		System.out.println("Professor não vinculado a nenhum seminário");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Seminario[] getSeminarios() {
		return seminarios;
	}

	public void setSeminarios(Seminario[] seminarios) {
		this.seminarios = seminarios;
	}

}

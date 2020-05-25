package br.com.felipesantos.javacore.associacao.exercicio;

public class Seminario {
	private String titulo;
	private Aluno[] alunos;
	private Professor professor;
	private Local local;	
	
	private Seminario() {
		
	}
	
	public Seminario(String titulo) {
		super();
		this.titulo = titulo;		
	}
	
	public void print() {
		System.out.println("-----------RELATORIO DE SEMINÁRIOS---------------");
		System.out.println("Titulo: " + this.titulo);
		if (this.professor != null) {
			System.out.println("Professor palestrante: " + this.professor.getNome());
			return;
		}
		System.out.println("Nenhum professor cadastrado para esse seminário");
		
		if(this.local != null) {
			System.out.println("Local: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
		}else {
			System.out.println("Nenhum local cadastrado para esse seminário!");
		}
		
		if(this.alunos != null && alunos.length != 0) {
			System.out.println("----Alunos participantes----");
			for(Aluno aluno : this.alunos) {
				System.out.println(aluno.getNome());
			}
			return;
		}
		System.out.println("Nenhum aluno cadastrado nesse seminário!");

	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	
	
}

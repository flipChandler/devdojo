package br.com.felipesantos.javacore.serializacao.classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Aluno implements Serializable {
	private Long id;
	private String nome;
	private transient String password; // transient -> para ignorar o atributo na serializa��o
	private static String nomeEscola = "DevDojo";
	private transient Turma turma;
	
	
	public Aluno(Long id, String nome, String password) {
		this.id = id;
		this.nome = nome;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", nomeEscola=" + nomeEscola + ", turma=" + turma +  ", password=" + password + "]";
	}
	
	// para serializar a associa��o de turma (n�o implementou Serializable) em aluno **
	private void writeObject(ObjectOutputStream objectOutputStream) {
		try {
			objectOutputStream.defaultWriteObject();
			objectOutputStream.writeUTF(turma.getNome());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//**
	private void readObject(ObjectInputStream objectInputStream) {
		try {
			objectInputStream.defaultReadObject();
			turma = new Turma(objectInputStream.readUTF());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static String getNomeEscola() {
		return nomeEscola;
	}
	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	


	
}
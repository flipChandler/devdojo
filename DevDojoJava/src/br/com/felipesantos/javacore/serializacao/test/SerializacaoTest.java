package br.com.felipesantos.javacore.serializacao.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.felipesantos.javacore.serializacao.classes.Aluno;
import br.com.felipesantos.javacore.serializacao.classes.Turma;

public class SerializacaoTest {

	public static void main(String[] args) {
		gravadorObjeto();
		leitorObjeto();
	}
	
	//serializa em linguagem da JVM - bytecode
	private static void gravadorObjeto() {
		Turma turma = new Turma("Maratona Java");
		Aluno aluno = new Aluno(1L, "Felipe Santos", "123456");
		aluno.setTurma(turma);
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
			objectOutputStream.writeObject(aluno);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// desserializa o bytecode e print na tela
	private static void leitorObjeto() {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
			Aluno aluno = (Aluno) objectInputStream.readObject();
			System.out.println(aluno);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
}

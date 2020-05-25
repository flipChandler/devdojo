package br.com.felipesantos.javacore.associacao.exercicio;

public class AssociacaoTest {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Felipe", 33);		
		Aluno aluno2 = new Aluno("Ana Bolena", 25);
		
		Seminario seminario = new Seminario("Como ser um programador e ficar rico");
		Seminario seminario2 = new Seminario("Meditações de Marco Aurelio");
		Professor professor = new Professor("Yoda", "Usar a força para programar!");
		Local local = new Local("Rua das Araras", "mato");
		
		// AQUI ACONTECE A ASSOCIACAO
		aluno.setSeminario(seminario);
		aluno2.setSeminario(seminario);
		
		//seminario.setProfessor(professor);
		//seminario.setLocal(local);
		//seminario.setAlunos(new Aluno[] {aluno, aluno2});
		
		Seminario[] arraySeminario = new Seminario[2];
		arraySeminario[0] = seminario;	
		arraySeminario[1] = seminario2;	
		
		professor.setSeminarios(arraySeminario);
		professor.print();
		
		seminario.print();
		
		

	}

}

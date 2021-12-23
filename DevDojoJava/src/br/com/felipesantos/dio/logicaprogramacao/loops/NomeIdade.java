package br.com.felipesantos.dio.loops;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade = 0;
        int continuar = 1;

        do {
            System.out.println("Digite o nome do aluno: ");
            nome = scanner.next();
            System.out.println("Digite a idade do aluno: ");
            idade = scanner.nextInt();

            System.out.println("Deseja continuar?");
            continuar = scanner.nextInt();
        } while(continuar != 0);

    }
}

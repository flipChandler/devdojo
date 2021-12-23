package br.com.felipesantos.dio.logicaprogramacao.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota = 0;

        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextInt();
            if(nota > -1 && nota < 11) {
                break;
            }
            System.out.println("Nota inválida! Digite novamente: ");
        } while (nota < 0 || nota > 10);

    }
}

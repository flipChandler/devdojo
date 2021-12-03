package br.com.felipesantos.dio.loops;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial, i;

        System.out.println("Digite o número o qual deseja aber o seu fatorial:");
        fatorial = scanner.nextInt();

        for (i = fatorial; i > 1; ) {
            System.out.print(i + " x ");
            fatorial *= --i;
        }
        System.out.println(i + " = " + fatorial);

    }
}

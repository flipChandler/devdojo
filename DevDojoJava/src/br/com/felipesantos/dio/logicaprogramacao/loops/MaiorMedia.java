package br.com.felipesantos.dio.logicaprogramacao.loops;

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0, media = 0, numero = 0, i = 0;

        while(i < 5) {
            System.out.printf("Digite o %d número: ", i+1);
            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            media += numero;
            i++;
        }

        media /= 5;

        System.out.println("O maior é : " + maior);
        System.out.println("A média é: " + media);

    }
}

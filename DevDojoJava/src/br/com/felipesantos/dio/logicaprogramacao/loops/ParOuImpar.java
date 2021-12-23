package br.com.felipesantos.dio.logicaprogramacao.loops;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, valor, contPar = 0, contImpar = 0;

        System.out.println("Digite quantos numeros vc deseja digitar: ");
        n = scanner.nextInt();

        while (n != 0) {
            System.out.println("Digite um número: ");
            valor = scanner.nextInt();
            if (valor % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            n--;
        }

        System.out.println("Quantidade de pares: " + contPar);
        System.out.println("Quantidade de impares: " + contImpar);
    }
}

package br.com.felipesantos.dio.desafio;

import java.math.BigInteger;
import java.util.Scanner;

public class TabuleiroXadrez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int numCasasTabuleiro = scanner.nextInt();
            BigInteger quantGraos = BigInteger.valueOf(2);
            quantGraos = quantGraos.pow(numCasasTabuleiro);
            BigInteger quantKg = quantGraos.divide(BigInteger.valueOf(12000));
            System.out.println(quantKg + " kg");
        }
        int num = Math.abs(-10);
        System.out.println(num);
        scanner.close();
    }
}



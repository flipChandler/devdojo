package br.com.felipesantos.dio.arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4]; // 4 linhas e 4 colunas

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { // tamanho da linha
                matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : matriz) {
            for (int elementoColuna : linha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();
        }

    }
}

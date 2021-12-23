package br.com.felipesantos.dio.arrays;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {15,2,35,8,7,4};

        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        for (int i = vetor.length - 1; i > -1; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}

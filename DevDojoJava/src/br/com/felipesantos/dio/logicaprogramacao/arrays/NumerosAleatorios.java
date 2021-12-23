package br.com.felipesantos.dio.logicaprogramacao.arrays;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }
        System.out.print("numeros aletorios: ");
        for(int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nsucessores dos numeros aletorios: ");
        for(int numero : numerosAleatorios) {
            System.out.print(numero + 1 + " ");
        }
    }
}

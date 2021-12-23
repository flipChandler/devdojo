package br.com.felipesantos.dio.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabuada;

        System.out.println("Qual tabuada vc deseja exibir?");
        tabuada = scanner.nextInt();
        System.out.println("Tabuada de " + tabuada + ":");
        for (int i = 1; i < 11; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }
    }
}

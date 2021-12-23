package br.com.felipesantos.dio.logicaprogramacao.arrays;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0, i = 0;

        String regex = "^([AEIOUaeiou])";
        do {
            System.out.println("Letra: ");
            String letra = scanner.next();

            if (!letra.matches(regex)) {
                consoantes[i] = letra;
                quantidadeConsoantes++;
            }
            i++;
        } while(i < consoantes.length);

        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nQuantidade de consoantes: " + quantidadeConsoantes);
    }
}

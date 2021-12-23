package br.com.felipesantos.dio.logicaprogramacao.loops;

public class Impar {
    public static void main(String[] args) {
        for (int i = 1; i < 12; i += 2) {
            if (i == 7) {
                continue;
                // return;
                // break;
            }
            System.out.println(i);
        }

    }
}

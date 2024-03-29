package br.com.felipesantos.dio.logicaprogramacao.desafios;

import java.util.Scanner;

public class DamaNoXadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1,y1,x2,y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0) break; //condição de parada
            else if (x1 == x2 && y1 == y2)
                System.out.println("0");
            else if (x1 == x2 || y1 == y2 || Math.abs(x1-x2) == Math.abs(y1-y2))
                System.out.println("1");
            else
                System.out.println("2");
        }
        scanner.close();
    }
}

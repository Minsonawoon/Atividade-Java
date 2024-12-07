package exercicioslogica;
import java.util.Scanner;

public class Ex106 {
    public static void main(String[] args) {
//        106) Escreva um programa que leia duas matrizes 2x2 de números inteiros e verifique se elas são iguais.

        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        boolean iguais = true;

        System.out.println("Digite os valores para a primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz1[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Digite os valores para a segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = entrada.nextInt();
                if (matriz1[i][j] != matriz2[i][j]) {
                    iguais = false;
                }
            }
        }

        if (iguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes são diferentes.");
        }
    }
}

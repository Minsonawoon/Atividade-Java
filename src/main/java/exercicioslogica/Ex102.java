package exercicioslogica;
import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {
//        102) Faça um programa que leia duas matrizes 2x2 de números inteiros e exiba o produto entre elas.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] produto = new int[2][2];

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
            }
        }

        System.out.println("O produto das duas matrizes é:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                produto[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    produto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
                System.out.print(produto[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package exercicioslogica;
import java.util.Scanner;

public class Ex110 {
    public static void main(String[] args) {
//        110) Crie um programa que leia duas matrizes 2x2 de números inteiros e exiba a subtração entre elas.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] subtracao = new int[2][2];

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

        System.out.println("A subtração das duas matrizes é:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                subtracao[i][j] = matriz1[i][j] - matriz2[i][j];
                System.out.print(subtracao[i][j] + " ");
            }
            System.out.println();
        }
    }
}

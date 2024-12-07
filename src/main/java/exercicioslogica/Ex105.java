package exercicioslogica;
import java.util.Scanner;

public class Ex105 {
    public static void main(String[] args) {
//        105) Faça um programa que leia uma matriz 4x4 de números inteiros e exiba a soma dos elementos de cada coluna.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];

        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = entrada.nextInt();
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos de cada coluna é:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + (j + 1) + ": " + somaColunas[j]);
        }
    }
}

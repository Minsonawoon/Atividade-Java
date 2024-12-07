package exercicioslogica;
import java.util.Scanner;

public class Ex107 {
    public static void main(String[] args) {
//        107) Crie um programa que leia uma matriz 3x3 de números inteiros e exiba o produto dos elementos da diagonal secundária.

        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int produto = 1;

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
                if (i + j == 2) {
                    produto *= matriz[i][j];
                }
            }
        }

        System.out.println("O produto dos elementos da diagonal secundária é: " + produto);
    }
}

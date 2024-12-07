package exercicioslogica;
import java.util.Scanner;

public class Ex98 {
    public static void main(String[] args) {
//        98) Crie um programa que leia uma matriz 3x3 de números inteiros e exiba a soma dos elementos da diagonal principal.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("A soma da diagonal principal é: " + somaDiagonal);
    }
}
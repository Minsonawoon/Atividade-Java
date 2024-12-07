package exercicioslogica;
import java.util.Scanner;

public class Ex108 {
    public static void main(String[] args) {
//        108)Faça um programa que leia uma matriz 4x4 de números inteiros e exiba o maior valor presente em cada linha.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("Maior valor de cada linha:");
        for (int i = 0; i < 4; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            System.out.println("Linha " + (i + 1) + ": " + maior);
        }
    }
}

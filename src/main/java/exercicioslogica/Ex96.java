package exercicioslogica;
import java.util.Scanner;

public class Ex96 {
    public static void main(String[] args) {
//        96) Faça um programa que leia uma matriz 3x3 de números inteiros e exiba a matriz na tela.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

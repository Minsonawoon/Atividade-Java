package exercicioslogica;
import java.util.Scanner;

public class Ex100 {
    public static void main(String[] args) {
//        100) Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba o maior valor presente na matriz.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        System.out.println("O maior valor na matriz é: " + maior);
    }
}

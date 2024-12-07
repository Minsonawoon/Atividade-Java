package exercicioslogica;
import java.util.Scanner;

public class Ex103 {
    public static void main(String[] args) {
//        103) Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba o menor valor presente na matriz.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("O menor valor na matriz é: " + menor);
    }
}

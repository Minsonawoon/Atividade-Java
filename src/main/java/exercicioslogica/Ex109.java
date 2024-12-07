package exercicioslogica;
import java.util.Scanner;

public class Ex109 {
    public static void main(String[] args) {
//        109) Escreva um programa que leia uma matriz 3x3 de números inteiros e verifique se ela é uma matriz identidade.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean identidade = true;

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
                if ((i == j && matriz[i][j] != 1) || (i != j && matriz[i][j] != 0)) {
                    identidade = false;
                }
            }
        }

        if (identidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }
    }
}

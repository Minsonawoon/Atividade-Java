package exercicioslogica;
import java.util.Scanner;

public class Ex101 {
    public static void main(String[] args) {
//        101) Crie um programa que leia uma matriz 4x4 de números inteiros e exiba a média aritmética dos elementos.
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;
        int elementos = 4 * 4;

        System.out.println("Digite os valores para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = entrada.nextInt();
                soma += matriz[i][j];
            }
        }

        double media = (double) soma / elementos;
        System.out.println("A média aritmética dos elementos é: " + media);
    }
}
package exercicioslogica;
import java.util.Scanner;

public class Ex83 {
    public static void main(String[] args) {
//        83) Crie um programa que leia 7 números inteiros e exiba a média aritmética dos valores lidos.

        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[7];
        int soma = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = entrada.nextInt();
            soma += vetor[i];
        }

        double media = (double) soma / 7;

        System.out.printf("A média aritmética é: %.2f", media);
    }
}
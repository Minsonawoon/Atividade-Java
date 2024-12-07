package exercicioslogica;
import java.util.Scanner;

public class Ex84 {
    public static void main(String[] args) {
//        84) Faça um programa que leia 5 números inteiros e exiba quantos deles são pares.

        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];
        int quantPares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número: ");
            vetor[i] = entrada.nextInt();

            if (vetor[i] % 2 == 0) {
                quantPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantPares);
    }
}
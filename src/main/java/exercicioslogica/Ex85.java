package exercicioslogica;
import java.util.Scanner;

public class Ex85 {
    public static void main(String[] args) {
//        85) Escreva um programa que leia 5 números inteiros e exiba o maior e o menor valor digitado.

        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = entrada.nextInt();
        }

        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 1; i < 5; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("Maior valor: " + maior + " .Menor valor: " + menor);
    }
}
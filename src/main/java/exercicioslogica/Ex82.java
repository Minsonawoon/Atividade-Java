package exercicioslogica;
import java.util.Scanner;

public class Ex82 {
    public static void main(String[] args) {
//        82) Escreva um programa que leia 10 números inteiros e exiba a soma deles.

        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número: ");
            vetor[i] = entrada.nextInt();
            soma += vetor[i];
        }

        System.out.println("A soma dos números é: " + soma);
    }
}
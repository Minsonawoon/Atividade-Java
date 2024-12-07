package exercicioslogica;
import java.util.Scanner;

public class Ex81 {
    public static void main(String[] args) {
//        81) Faça um programa que leia 5 números inteiros e exiba-os na ordem inversa em que foram digitados.

        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = entrada.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}

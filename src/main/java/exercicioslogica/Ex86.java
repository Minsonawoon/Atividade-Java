package exercicioslogica;
import java.util.Scanner;
import java.util.Arrays;

public class Ex86 {
    public static void main(String[] args) {
//        86) Crie um programa que leia 10 números inteiros e exiba-os em ordem crescente.

        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número: ");
            vetor[i] = entrada.nextInt();
        }

        Arrays.sort(vetor);

        for (int numero : vetor) {
            System.out.println(numero);
        }
    }
}

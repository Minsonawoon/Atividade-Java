package exercicioslogica;
import java.util.Scanner;

public class Ex94 {
    public static void main(String[] args) {
//        94) Escreva um programa que leia 7 números inteiros e exiba apenas os números pares.

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[7];

        System.out.println("Digite 7 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Números pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}

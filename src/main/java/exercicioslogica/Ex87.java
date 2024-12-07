package exercicioslogica;
import java.util.Scanner;

public class Ex87 {
    public static void main(String[] args) {
//        87) Faça um programa que leia 10 números inteiros e exiba quantos deles são positivos.

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivos = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
            if (numeros[i] > 0) {
                positivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + positivos);
    }
}


package exercicioslogica;
import java.util.Scanner;

public class Ex91 {
    public static void main(String[] args) {
//        91) Escreva um programa que leia 10 números inteiros e exiba a soma dos valores positivos e a soma dos valores negativos.

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPositivos = 0;
        int somaNegativos = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
            if (numeros[i] > 0) {
                somaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                somaNegativos += numeros[i];
            }
        }

        System.out.println("Soma dos positivos: " + somaPositivos + " .Soma dos negativos: " + somaNegativos);
    }
}

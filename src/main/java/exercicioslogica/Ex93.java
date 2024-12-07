package exercicioslogica;
import java.util.Scanner;

public class Ex93 {
    public static void main(String[] args) {
//        93) Faça um programa que leia 10 números inteiros e exiba quantos deles estão no intervalo de 10 a 50.

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
            if (numeros[i] >= 10 && numeros[i] <= 50) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo de 10 a 50: " + contador);
    }
}
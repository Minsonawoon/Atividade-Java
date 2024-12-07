package exercicioslogica;
import java.util.Scanner;

public class Ex89 {
    public static void main(String[] args) {
//        89) Crie um programa que leia 10 números inteiros e exiba a quantidade de números positivos e a quantidade de números negativos.

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + positivos);
        System.out.println("Quantidade de números negativos: " + negativos);
    }
}


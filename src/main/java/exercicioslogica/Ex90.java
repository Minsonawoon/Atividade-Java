package exercicioslogica;
import java.util.Scanner;

public class Ex90 {
    public static void main(String[] args) {
        //    90)Faça um programa que leia 5 números inteiros e verifique se algum deles é igual a zero.

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean temZero = false;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
            if (numeros[i] == 0) {
                temZero = true;
            }
        }

        if (temZero) {
            System.out.println("Há pelo menos um número igual a zero.");
        } else {
            System.out.println("Não há números iguais a zero.");
        }
    }
}


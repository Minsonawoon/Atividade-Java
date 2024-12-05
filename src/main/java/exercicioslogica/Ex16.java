package exercicioslogica;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        16) Faça um programa que verifique se um número é positivo, negativo ou zero.

        System.out.println("Digite um número:");
        float num = entrada.nextFloat();

        if (num > 0) {
            System.out.println(num + " é um número positivo.");
        } else if (num < 0) {
            System.out.println(num + " é um número negativo.");
        } else {
            System.out.println(num + " é igual a zero.");
        }
    }
}

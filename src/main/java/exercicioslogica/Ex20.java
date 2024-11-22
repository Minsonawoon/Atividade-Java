package CriandoProgramas;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        20) Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.

        System.out.println("Digite um número para saber se ele é par ou ímpar: ");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é par.");
        } else {
            System.out.println(num + " é ímpar.");
        }
    }
}

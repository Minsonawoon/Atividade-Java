package exercicioslogica;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        18) Crie um programa que leia dois números inteiros e exiba o maior deles.

        System.out.println("Digite o primeiro número:");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("O maior é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior é " + num2);
        } else {
            System.out.println("São números iguais!");
        }
    }
}

package CriandoProgramas;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        8) Escreva um programa que leia dois números inteiros e troque os
//        seus valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa.

        System.out.println("Digite um número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();

        System.out.println("Os valores atuais são: ");
        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);
        System.out.println();

        int num3 = num1;
        num1 = num2;
        num2 = num3;

        System.out.println("Os valores trocados ficam: ");
        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);

    }
}

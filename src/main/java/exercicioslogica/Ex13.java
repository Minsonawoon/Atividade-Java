package CriandoProgramas;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        13) Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo.

        System.out.println("Digite o primeiro número:");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = entrada.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("É múltiplo do segundo!");
        } else {
            System.out.println("Não é múltiplo do segundo!");
        }

    }
}

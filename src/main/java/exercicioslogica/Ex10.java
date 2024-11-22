package CriandoProgramas;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        10) Faça um programa que leia um número inteiro e exiba a sua tabuada de multiplicação até o décimo valor.

        System.out.println("Digite um número para saber a tabuada:");
        int num1 = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num1 + " X " + i + " = " + (num1 * i));
        }
    }
}

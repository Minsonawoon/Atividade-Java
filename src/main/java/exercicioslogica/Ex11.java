package CriandoProgramas;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        11) Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.

        System.out.println("Digite o primeiro número: ");
        float num1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        float num2 = entrada.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float num3 = entrada.nextFloat();

        float media = (num1 + num2 + num3) / 3;

        System.out.println(String.format("A média aritmética é de: %.2f", media));
    }
}

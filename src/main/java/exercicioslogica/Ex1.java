package exercicioslogica;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        1) Faça um programa que solicite dois números inteiros e exiba a soma, subtração, multiplicação e divisão entre eles.

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multi = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("A soma dos números é de: " + soma);
        System.out.println("A subtração dos números é de: " + subtracao);
        System.out.println("A multiplicação dos números é de: " + multi);
        System.out.println("A divisão dos números é de: " + divisao);
    }
}

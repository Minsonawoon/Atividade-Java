package exercicioslogica;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
//        58) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido usando o loop "do-while".

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = entrada.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci até " + limite + ":");

        do {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        } while (a <= limite);
    }
}
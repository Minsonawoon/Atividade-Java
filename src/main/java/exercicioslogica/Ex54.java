package exercicioslogica;
import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
//        54) Faça um programa que leia 5 números inteiros usando o loop "do-while" e exiba a média aritmética dos valores lidos.
        Scanner entrada = new Scanner(System.in);

        int soma = 0;
        int count = 0;

        do {
            System.out.println("Digite um número inteiro:");
            int numero = entrada.nextInt();
            soma += numero;
            count++;
        } while (count < 5);

        double media = (double) soma / count;

        System.out.println("A média aritmética dos valores lidos é: " + media);
    }
}


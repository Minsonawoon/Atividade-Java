package exercicioslogica;
import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {
        // 69) Faça um programa que leia 5 números inteiros e exiba a média aritmética dos valores lidos.
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();

            soma += numero;
        }

        double media = (double) soma / 5;
        System.out.printf("Média aritmética: %.2f", media);
    }
}


package exercicioslogica;
import java.util.Scanner;

public class Ex72 {
    public static void main(String[] args) {
//        72) Faça um programa que leia um número inteiro e exiba se ele é um número primo.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int divisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
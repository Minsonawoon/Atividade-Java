package exercicioslogica;
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        42) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "while".

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        int divisor = 2;
        while (divisor < numero) {
            if (numero % divisor == 0) {
                System.out.println(numero + " não é primo");
                return;
            }
            divisor++;
        }

        System.out.println(numero + " é primo");
    }
}

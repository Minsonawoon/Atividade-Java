package exercicioslogica;
import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
//        57) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "do-while".

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int divisores = 0;
        int i = 1;

        do {
            if (numero % i == 0) {
                divisores++;
            }
            i++;
        } while (i <= numero);

        if (divisores == 2) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
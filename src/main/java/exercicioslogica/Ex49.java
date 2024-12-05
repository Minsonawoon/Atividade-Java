package exercicioslogica;
import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
//        49) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "while".
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = entrada.nextInt();

        int fatorial = 1;
        int i = 1;

        while (i <= numero) {
            fatorial *= i;
            i++;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}


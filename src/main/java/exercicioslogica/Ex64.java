package exercicioslogica;
import java.util.Scanner;


public class Ex64 {
    public static void main(String[] args) {
//        64) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "do-while".

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        long fatorial = 1;
        int i = 1;

        do {
            fatorial *= i;
            i++;
        } while (i <= numero);

        System.out.println("Fatorial de " + numero + ": " + fatorial);
    }
}
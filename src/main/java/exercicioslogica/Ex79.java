package exercicioslogica;
import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
//        79) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        long fatorial = 1;

        for (int contador = 1; contador <= numero; contador++) {
            fatorial *= contador;
        }

        System.out.println("Fatorial de " + numero + ": " + fatorial);
    }
}
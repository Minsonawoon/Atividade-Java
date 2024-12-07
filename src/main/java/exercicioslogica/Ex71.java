package exercicioslogica;
import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args) {
//        71) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = entrada.nextInt();

        System.out.println("Divisores de " + numero + ":");

        for (int divisor = 1; divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                System.out.print(divisor + " ");
            }
        }
    }
}
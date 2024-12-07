package exercicioslogica;
import java.util.Scanner;

public class Ex73 {
    public static void main(String[] args) {
//        73) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = entrada.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci até " + limite + ":");

        for (int proximo = a; proximo <= limite; proximo = a + b) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
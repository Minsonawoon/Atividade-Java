package exercicioslogica;
import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {

//    43) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido usando o loop "while".
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int limite = entrada.nextInt();

        int primeiro = 0;
        int segundo = 1;

        System.out.println("Sequência de Fibonacci:");

        while (primeiro <= limite) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
    }
}

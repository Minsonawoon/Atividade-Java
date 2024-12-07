package exercicioslogica;
import java.util.Scanner;

public class Ex76 {
    public static void main(String[] args) {
//        76) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = entrada.nextInt();

        int soma = 0;

        for (int numero = 1; numero <= limite; numero++) {
            if (numero % 2 == 0) {
                soma += numero;
            }
        }
        System.out.println("Soma dos números pares até " + limite + ": " + soma);
    }
}
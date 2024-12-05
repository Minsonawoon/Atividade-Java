package exercicioslogica;
import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
//        46) Escreva um programa que leia um número inteiro e exiba a soma de
//        os números pares entre 1 e o número lido usando o loop "while".

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = entrada.nextInt();

        int soma = 0;
        int i = 1;

        while (i <= numero) {
            if (i % 2 == 0) {
                soma += i;
            }
            i++;
        }

        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + soma);
    }
}

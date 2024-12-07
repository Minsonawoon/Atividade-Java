package exercicioslogica;
import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
//        61) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número
//        lido usando o loop "do-while".

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = entrada.nextInt();

        int soma = 0;
        int numero = 1;

        do {
            if (numero % 2 == 0 && numero <= limite) {
                soma += numero;
            }
            numero++;
        } while (numero <= limite);

        System.out.println("Soma dos números pares até " + limite + ": " + soma);
    }
}
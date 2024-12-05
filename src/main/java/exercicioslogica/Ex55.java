package exercicioslogica;
import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
//        55) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "do-while".
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = entrada.nextInt();

        int i = 1;

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
    }
}


package exercicioslogica;
import java.util.Scanner;

public class Ex70 {
    public static void main(String[] args) {
//        70) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para a tabuada: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }
}
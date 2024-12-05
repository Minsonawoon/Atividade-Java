package exercicioslogica;
import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
//        48)Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente usando o loop "while".

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = entrada.nextInt();

        System.out.println("Os dígitos do número são:");

        if (numero < 0) {
            System.out.print("-");
            numero = -numero;
        }

        String numeroStr = String.valueOf(numero);
        int i = 0;

        while (i < numeroStr.length()) {
            char digito = numeroStr.charAt(i);
            System.out.print(digito + " ");
            i++;
        }
    }
}


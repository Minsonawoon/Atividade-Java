package exercicioslogica;
import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
//        56) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "do-while".

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = entrada.nextInt();

        int i = 1;

        System.out.println("Os divisores de " + numero + " são:");

        do {
            if (numero % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);
    }
}


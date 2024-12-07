package exercicioslogica;
import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
//        63) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente usando o loop "do-while".

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int copiaNumero = numero;

        System.out.println("Dígitos do número " + numero + ":");

        do {
            int digito = copiaNumero % 10;
            System.out.print(digito + " ");
            copiaNumero /= 10;
        } while (copiaNumero > 0);
    }
}
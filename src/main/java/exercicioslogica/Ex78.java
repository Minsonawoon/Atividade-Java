package exercicioslogica;
import java.util.Scanner;

public class Ex78 {
    public static void main(String[] args) {
//        78) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente.
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = entrada.nextInt();

    System.out.println("Dígitos do número " + numero + ":");

        for (int copiaNumero = numero; copiaNumero > 0; copiaNumero /= 10) {
            int digito = copiaNumero % 10;
            System.out.print(digito + " ");
        }
    }
}
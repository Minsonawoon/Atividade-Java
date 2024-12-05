package exercicioslogica;
import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//      39) Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética dos valores lidos.
        float numero;
        float novoNumero = 0;

        int i = 1;

        while (i <= 5) {
            System.out.println("Digite um número: ");
            numero = entrada.nextFloat();
            novoNumero += numero;
            i++;
        }

        float media = novoNumero / 5;

        System.out.println("A média dos números é de: " + media);
    }
}

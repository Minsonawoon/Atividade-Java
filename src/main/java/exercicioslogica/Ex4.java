package exercicioslogica;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        4) Faça um programa que receba três notas de um aluno
//        (cada nota de 0 a 10) e calcule a média ponderada considerando pesos 2, 3 e 5 para as notas, respectivamente.

        System.out.println("Digite a primeira nota: ");
        float n1 = entrada.nextFloat();

        System.out.println("Digite a segundo nota: ");
        float n2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float n3 = entrada.nextFloat();

        float mediaPonderada = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);

        System.out.println("A média ponderada é de: " + mediaPonderada);
    }
}

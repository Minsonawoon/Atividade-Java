package CriandoProgramas;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        19) Faça um programa que receba três notas de um aluno e exiba se ele foi aprovado ou reprovado. A média para aprovação é 7.

        System.out.println("Digite a primeira nota:");
        float nota1 = entrada.nextFloat();

        System.out.println("Digite o segundo nota:");
        float nota2 = entrada.nextFloat();

        System.out.println("Digite o terceiro nota:");
        float nota3 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media > 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

    }
}

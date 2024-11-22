package CriandoProgramas;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        17) Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem indicando se
//        ela é criança, adolescente, adulto ou idoso.

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        if (idade < 12) {
            System.out.println("É criança!");
        } else if (idade < 18) {
            System.out.println("É adolescente!");
        } else if (idade <= 64) {
            System.out.println("É adulto!");
        } else {
            System.out.println("É idoso!");
        }
    }
}

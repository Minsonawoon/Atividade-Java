package CriandoProgramas;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        12) Crie um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC).

        System.out.println("Digite o peso:");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura:");
        double alt = entrada.nextDouble();

        double imc = peso / (alt * alt);

        System.out.println(String.format("O seu índice de massa Corporal (IMC) é de: %.2f", imc));
    }
}

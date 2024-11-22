package CriandoProgramas;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double montante = 0;

//        9) Crie um programa que leia o valor do depósito mensal em uma poupança e a taxa de juros mensal, e calcule
//        o montante após 12 meses.

        System.out.println("Qual o valor do depósito mensal?");
        double deposito = entrada.nextDouble();

        System.out.println("Qual a taxa de juros mensal?");
        double taxaMensal = entrada.nextDouble();

        taxaMensal = taxaMensal / 100;

        for (int i = 1; i <= 12; i++) {
            montante += deposito;
            montante += montante * taxaMensal;
        }

        System.out.println(String.format("O montante após 12 meses será de: R$ %.2f", montante));

    }
}

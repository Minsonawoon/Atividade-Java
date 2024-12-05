package exercicioslogica;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        7) Faça um programa que receba o salário base de um
//        funcionário e calcule o seu salário líquido, considerando que o funcionário recebe 5% de comissão sobre o salário base.

        System.out.println("Digite o salário base: ");
        float salario = entrada.nextFloat();

        double salarioLiquido = salario * 1.05;

        System.out.println("O salário líquido com a comissão é de: " + salarioLiquido);
    }
}

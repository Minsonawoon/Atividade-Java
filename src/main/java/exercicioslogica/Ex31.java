package exercicioslogica;
import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//    31) Faça um programa que leia o valor do salário-mínimo e o salário de um funcionário, e exiba quantos salários-mínimos ele recebe.

        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = entrada.nextDouble();

        System.out.println("Digite o valor do salário do funcionário:");
        double salarioFunc = entrada.nextDouble();

        double quantSalarios = salarioFunc / salarioMinimo;

        System.out.println("O funcionário recebe " + String.format("%.2f", quantSalarios));

    }
}

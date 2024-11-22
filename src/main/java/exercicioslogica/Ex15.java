package CriandoProgramas;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        15) Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.

        System.out.println("Digite o salário:");
        double salario = entrada.nextDouble();

        double novoSalario = salario * 1.15;

        System.out.println(String.format("O novo salário é de: %.2f", novoSalario));
    }
}

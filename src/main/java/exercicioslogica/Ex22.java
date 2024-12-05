package exercicioslogica;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        22) Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus.
//        Se o salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.

        System.out.println("Digite o salário:");
        double salario = entrada.nextDouble();

        if(salario > 2000) {
            salario = salario * 1.10;
            System.out.println(String.format("O valor do salário (10%%) é: R$ %.2f", salario));
        } else {
            salario = salario * 1.05;
            System.out.println(String.format("O valor do salário (5%%) é: R$ %.2f", salario));
        }
    }
}

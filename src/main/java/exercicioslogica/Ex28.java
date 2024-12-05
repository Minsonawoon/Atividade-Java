package exercicioslogica;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        28) Faça um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC)
//        e a sua classificação. Considere a tabela de classificação do IMC.

        System.out.println("Digite o peso:");
        double peso = entrada.nextDouble();

        System.out.println("Digite a altura:");
        double alt = entrada.nextDouble();

        double imc = peso / (alt * alt);

        if (imc < 18.5) {
            System.out.println(imc + ", abaixo do peso");
        } else if (imc < 25) {
            System.out.println(imc + ", peso normal");
        } else if (imc < 30) {
            System.out.println(imc + ", sobrepeso");
        } else if (imc < 35) {
            System.out.println(imc + ", Obesidade Grau I");
        } else if (imc < 40) {
            System.out.println(imc + ", Obesidade Grau II");
        } else {
            System.out.println(imc + ", Obesidade Grau III");
        }

    }
}

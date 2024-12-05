package exercicioslogica;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        30) Crie um programa que leia o número de maçãs compradas e exiba o valor total a ser pago.
//        O preço das maçãs é de R$ 0,50 cada se a quantidade for menor que 12 e R$ 0,40 cada se a quantidade for igual ou maior que 12.

        System.out.println("Digite a quantidade de maçãs compradas:");
        int quantidadeMacas = entrada.nextInt();

        double preco;

        if(quantidadeMacas < 12) {
            preco = quantidadeMacas * 0.50;
        } else {
            preco = quantidadeMacas * 0.40;
        }

        System.out.println("O valor total a ser pago é de: " + String.format("%.2f", preco));
    }
}

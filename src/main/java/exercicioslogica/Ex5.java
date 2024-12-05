package exercicioslogica;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        5) Escreva um programa que leia o preço de um produto e a quantidade comprada,
//        e calcule o valor total a ser pago com desconto de 10% se a quantidade for maior que 10 unidades.

        double soma;

        System.out.println("Digite o preço: ");
        float preco = entrada.nextFloat();

        System.out.println("Digite a quantidade: ");
        int quant = entrada.nextInt();

        if (quant > 10) {
            soma = (preco * quant) * 0.9;
        } else {
            soma = preco * quant;
        }

        System.out.println("O valor total é de: R$" + soma);
    }
}

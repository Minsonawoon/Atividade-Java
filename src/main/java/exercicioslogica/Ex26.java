package exercicioslogica;
import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        26) Escreva um programa que leia o código de um produto e a quantidade comprada,
//        e exiba o valor total a ser pago. Considere que cada produto tem um preço diferente.
        double precoUnitario = 0;

        System.out.println("Digite o código do produto (1 a 5):");
        int codigo = entrada.nextInt();

        System.out.println("Digite a quantidade:");
        int quantidade = entrada.nextInt();

        switch(codigo) {
            case 1:
                precoUnitario = 10.50;
                break;
            case 2:
                precoUnitario = 15.25;
                break;
            case 3:
                precoUnitario = 20.00;
                break;
            case 4:
                precoUnitario = 25.50;
                break;
            case 5:
                precoUnitario = 17.00;
                break;
            default:
                System.out.println("Código de produto inválido!");
        }

        double valorTotal = precoUnitario * quantidade;

        System.out.println(String.format("Valor total a pagar: R$ %.2f", valorTotal));

    }
}
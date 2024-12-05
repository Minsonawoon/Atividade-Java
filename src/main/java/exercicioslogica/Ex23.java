package exercicioslogica;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        23) Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui. Considere apenas meses válidos.


        int dias;
        System.out.println("Digite o nome do mês: ");
        String mes = entrada.nextLine();

        if(mes.equalsIgnoreCase("Janeiro")) {
            System.out.println("Janeiro possui 31 dias");
        } else if (mes.equalsIgnoreCase("Fevereiro")) {
            System.out.println("Fevereiro possui 28 dias");
        } else if (mes.equalsIgnoreCase("Março")) {
            System.out.println("Março possui 31 dias");
        } else if (mes.equalsIgnoreCase("Abril")) {
            System.out.println("Abril possui 30 dias");
        } else if (mes.equalsIgnoreCase("Maio")) {
            System.out.println("Maio possui 31 dias");
        } else if (mes.equalsIgnoreCase("Junho")) {
            System.out.println("Junho possui 30 dias");
        } else if (mes.equalsIgnoreCase("Julho")) {
            System.out.println("Julho possui 31 dias");
        } else if (mes.equalsIgnoreCase("Agosto")) {
            System.out.println("Agosto possui 31 dias");
        } else if (mes.equalsIgnoreCase("Setembro")) {
            System.out.println("Setembro possui 30 dias");
        } else if (mes.equalsIgnoreCase("Outubro")) {
            System.out.println("Outubro possui 31 dias");
        } else if (mes.equalsIgnoreCase("Novembro")) {
            System.out.println("Novembro possui 30 dias");
        } else if (mes.equalsIgnoreCase("Dezembro")) {
            System.out.println("Dezembro possui 31 dias");
        } else {
            System.out.println("Digite um mês válido!");
        }

    }
}

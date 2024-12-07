package exercicioslogica;
import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
//        59) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "do-while" e exiba a média das idades.
        Scanner entrada = new Scanner(System.in);

        int totalIdades = 0;
        int i = 1;

        do {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = entrada.next();

            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = entrada.nextInt();

            totalIdades += idade;
            i++;
        } while (i <= 5);

        double mediaIdades = (double) totalIdades / 5;
        System.out.printf("A média das idades é: %.2f", mediaIdades);
    }
}
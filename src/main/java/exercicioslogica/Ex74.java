package exercicioslogica;
import java.util.Scanner;

public class Ex74 {
    public static void main(String[] args) {
//        74) Crie um programa que leia o nome e a idade de 5 pessoas e exiba a média das idades.
        Scanner entrada = new Scanner(System.in);

        int totalIdades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = entrada.next();

            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = entrada.nextInt();

            totalIdades += idade;
        }

        double mediaIdades = (double) totalIdades / 5;
        System.out.printf("A média das idades é: %.2f", mediaIdades);
    }
}
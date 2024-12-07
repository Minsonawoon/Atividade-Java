package exercicioslogica;
import java.util.Scanner;

public class Ex80 {
    public static void main(String[] args) {
//        80) Crie um programa que leia o nome e a idade de várias pessoas até que o nome "fim" seja informado.
//        Ao final, exiba a média das idades.
        Scanner entrada = new Scanner(System.in);

        int totalIdades = 0;
        int totalPessoas = 0;
        String nome;

        for (;;) {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            nome = entrada.next();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Digite a idade: ");
            int idade = entrada.nextInt();

            totalIdades += idade;
            totalPessoas++;
        }

        if (totalPessoas > 0) {
            double mediaIdades = (double) totalIdades / totalPessoas;
            System.out.printf("Média das idades: %.2f", mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }
    }
}
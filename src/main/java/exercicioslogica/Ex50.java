package exercicioslogica;
import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
//        50) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "while"
//        até que o nome "fim" seja informado. Ao final, exiba a média das idades.

        Scanner entrada = new Scanner(System.in);

        String nome;
        int somaIdades = 0;
        int quantidadePessoas = 0;

        while (true) {
            System.out.println("Digite o nome ou fim para encerrar:");
            nome = entrada.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite a idade:");
            int idade = entrada.nextInt();
            entrada.nextLine();

            somaIdades += idade;
            quantidadePessoas++;
        }

        if (quantidadePessoas > 0) {
            int mediaIdades = somaIdades / quantidadePessoas;
            System.out.println("A média das idades é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }
    }
}


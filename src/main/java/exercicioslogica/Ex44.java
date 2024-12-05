package exercicioslogica;
import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        //    44) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "while" e exiba a média das idades.
        Scanner entrada = new Scanner(System.in);

        int somaIdade = 0;
        int i = 0;
        int media = 0;

        while(i < 5) {
            System.out.println("Digite o nome: ");
            String nome = entrada.nextLine();

            System.out.println("Digite a idade:");
            int idade = entrada.nextInt();

            somaIdade += idade;
            i++;
            entrada.nextLine();
        }

        media = somaIdade / 5;

        System.out.println("A média das idades é de: " + media);
    }
}

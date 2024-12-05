package exercicioslogica;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        21) Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade e quantas são maiores de idade.

        String resposta = "sim";
        int idade = 0;
        int maiorIdade = 0;
        int menorIdade = 0;

        while(resposta.equalsIgnoreCase("sim")){
            System.out.println("Digite uma idade: ");
            idade = entrada.nextInt();
            entrada.nextLine();

            if(idade >= 18) {
                maiorIdade++;
            } else {
                menorIdade++;
            }

            System.out.println("Deseja continuar? (sim/não)");
            resposta = entrada.nextLine();
        }
        System.out.println("Quantidade de pessoas maiores de idade: " + maiorIdade);
        System.out.println("Quantidade de pessoas menores de idade: " + menorIdade);
    }
}

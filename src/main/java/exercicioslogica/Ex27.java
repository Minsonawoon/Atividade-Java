package exercicioslogica;
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//    27) Crie um programa que leia a idade de uma pessoa e seu sexo (M ou F) e exiba uma
//    mensagem indicando se ela pode ou não se aposentar. Homens podem se aposentar com 65 anos ou mais, e mulheres com 60 anos ou mais.

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite seu sexo (M ou F):");
        String sexo = entrada.nextLine();

        if(!sexo.equals("M") && !sexo.equals("F")) {
            System.out.println("Sexo inválido! Digite M ou F.");
        }

        if(sexo.equals("M")) {
            if(idade >= 65) {
                System.out.println("Você já pode se aposentar!");
            } else {
                System.out.println("Você ainda não pode se aposentar.");
            }
        } else {
            if(idade >= 60) {
                System.out.println("Você já pode se aposentar!");
            } else {
                System.out.println("Você ainda não pode se aposentar.");
            }
        }

    }
}



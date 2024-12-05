package exercicioslogica;
import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        34) Faça um programa que leia a idade de uma pessoa e exiba se ela pode ou não votar.
//        O voto é obrigatório para pessoas entre 18 e 70 anos, e facultativo para pessoas entre 16 e 18 anos e com mais de 70 anos.

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        if(idade <= 15){
            System.out.println("Não pode votar!");
        } else if (idade >= 18 && idade <= 70){
            System.out.println("Voto obrigatório!");
        } else {
            System.out.println("Voto facultativo.");
        }
    }
}

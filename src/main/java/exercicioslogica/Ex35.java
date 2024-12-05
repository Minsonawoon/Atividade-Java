package exercicioslogica;
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        35) Escreva um programa que leia três números inteiros e exiba a média aritmética.
//        Se a média for maior ou igual a 7, exiba a mensagem "Aprovado", caso contrário, exiba a mensagem "Reprovado".

        System.out.println("Digite a primeira nota: ");
        float nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3 ) / 3;

        System.out.println("A média das notas é de: " + media);

        if(media >= 7) {
            System.out.println("Está aprovado!");
        } else {
            System.out.println("Você está reprovado...");
        }
    }
}

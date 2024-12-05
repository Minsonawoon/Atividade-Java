package exercicioslogica;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        32) Escreva um programa que leia a nota de um aluno em uma prova e exiba a sua conceituação conforme a tabela de notas.

        System.out.println("Digite a nota: ");
        float nota = entrada.nextFloat();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else if (nota >= 9 ) {
            System.out.println("A");
        } else if (nota >= 7) {
            System.out.println("B");
        } else if (nota >= 5) {
            System.out.println("C");
        } else if (nota >= 3) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}

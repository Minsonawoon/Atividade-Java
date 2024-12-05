package exercicioslogica;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//        25) Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua situação.
//                Se o número de faltas for maior que 15, ele é reprovado por falta.

        System.out.println("Digite a disciplina: ");
        String disciplina = entrada.nextLine();

        System.out.println("Digite o número de faltas:");
        int falta = entrada.nextInt();

        if (falta > 15) {
            System.out.println("Reprovado por faltas em " + disciplina);
        } else {
            System.out.println("Aprovado em " + disciplina);
        }
    }
}

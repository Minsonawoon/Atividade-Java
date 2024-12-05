package exercicioslogica;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        29) Escreva um programa que leia o nome e a nota de um aluno e exiba sua situação na disciplina.
//                Se a nota for maior ou igual a 7, o aluno está aprovado. Caso contrário, está em recuperação.

        System.out.println("Digite o nome do aluno:");
        String nome = entrada.nextLine();

        double nota;
        do {
            System.out.println("Digite a nota do aluno:");
            nota = entrada.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);

        if (nota >= 7) {
            System.out.println(nome + " está aprovado!");
            System.out.println("Nota: " + String.format("%.2f", nota));
        } else {
            System.out.println(nome + " está de recuperação!");
            System.out.println("Nota: " + String.format("%.2f", nota));
        }
    }
}

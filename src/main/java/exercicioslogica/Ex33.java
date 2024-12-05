package exercicioslogica;
import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        33) Crie um programa que leia o nome e o turno (M ou V) de um aluno e exiba uma mensagem de saudação de acordo com o turno.
//        Matutino: "Bom dia, aluno", Vespertino: "Boa tarde, aluno".

        System.out.println("Digite o nome do aluno:");
        String nome = entrada.nextLine();

        System.out.println("Digite o turno (M ou V) do aluno:");
        String turno = entrada.nextLine();

        if(turno.equalsIgnoreCase("M")) {
            System.out.println("Bom dia, " + nome);
        } else if (turno.equalsIgnoreCase("V")){
            System.out.println("Boa tarde, " + nome);
        } else {
            System.out.println("Turno incorreto.");
        }
    }
}

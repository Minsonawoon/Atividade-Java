package primeiraulabasico;
import java.util.Scanner;

public class Atividade2Java {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = entrada.nextFloat();

        System.out.println("Digite a quarta nota: ");
        float nota4 = entrada.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é de: " + media);

    }
}

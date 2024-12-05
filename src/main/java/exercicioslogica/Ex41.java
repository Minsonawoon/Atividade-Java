package exercicioslogica;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
//        41) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "while".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Divisores:");

        int divisor = 1;
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }
    }
}

package exercicioslogica;
import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
//        40) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "while".

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número da tabuada desejada: ");
        int numero = entrada.nextInt();
        
        int i = 1;
        
        while(i <= 10) {
            System.out.println(numero + " X " + i + " = " + numero*i);
            i++;
        }
    }
}

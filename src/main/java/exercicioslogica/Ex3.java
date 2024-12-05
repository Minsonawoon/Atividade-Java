package exercicioslogica;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        3) Crie um programa que leia a base e a altura de um triângulo e calcule sua área.

        System.out.println("Digite a base do triângulo: ");
        float base = entrada.nextFloat();

        System.out.println("Digite a altura do triângulo: ");
        float altura = entrada.nextFloat();

        double area = (base * altura) / 2;

        System.out.println("A área do triângulo é de: " + area);
    }
}

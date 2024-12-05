package exercicioslogica;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        2) Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro.

        System.out.println("Digite o raio do círculo: ");
        float raio = entrada.nextFloat();

        double area = 3.14 * (raio * raio);
        double perimetro = 2 * 3.14 * raio;

        System.out.println("A área do círculo é de: " + area + " .E seu perímetro e de: " + perimetro);
    }
}

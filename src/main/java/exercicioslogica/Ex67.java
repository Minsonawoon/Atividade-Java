package exercicioslogica;

public class Ex67 {
    public static void main(String[] args) {
//        67) Escreva um programa que calcule a soma dos números de 1 a 100.
        int soma = 0;

        for (int numero = 1; numero <= 100; numero++) {
            soma += numero;
        }

        System.out.println("Soma dos números de 1 a 100: " + soma);
    }
}
package exercicioslogica;

public class Ex77 {
    public static void main(String[] args) {
//        77) Crie um programa que exiba os números ímpares de 50 a 1.
        for (int numero = 50; numero >= 1; numero--) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
    }
}
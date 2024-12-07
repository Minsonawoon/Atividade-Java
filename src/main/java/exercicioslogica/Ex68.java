package exercicioslogica;

public class Ex68 {
    public static void main(String[] args) {
        // 68) Crie um programa que exiba os números pares de 1 a 50.

        for (int numero = 1; numero <= 50; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
    }
}

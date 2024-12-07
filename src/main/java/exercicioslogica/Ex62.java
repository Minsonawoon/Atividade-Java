package exercicioslogica;

public class Ex62 {
    public static void main(String[] args) {
        //    62) Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "do-while".
        int numero = 1;

        System.out.println("Números ímpares de 1 a 50:");

        do {
            System.out.print(numero + " ");
            numero += 2;
        } while (numero <= 50);
    }
}
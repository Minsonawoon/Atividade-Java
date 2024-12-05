package exercicioslogica;

public class Ex47 {
    public static void main(String[] args) {
//        47) Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "while".
        int numero = 1;

        while (numero <= 50) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
            numero++;
        }
    }
}


package exercicioslogica;

public class Ex52 {
    public static void main(String[] args) {
//        52) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "do-while".

        int soma = 0;
        int numero = 1;

        do {
            soma += numero;
            numero++;
        } while (numero <= 100);

        System.out.println("A soma dos números é: " + soma);
    }
}


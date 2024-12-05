package exercicioslogica;

public class Ex37 {
    public static void main(String[] args) {
//        37) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while".

        int valorAtual = 0;

        int i = 1;
        while (i <= 100) {
            valorAtual += i;
            i++;
        }

        System.out.println("A soma dos números de 1 a 100 é de: " + valorAtual);
    }
}

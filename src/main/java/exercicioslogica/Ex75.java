package exercicioslogica;

public class Ex75 {
    public static void main(String[] args) {
//        75) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci.
        int a = 0;
        int b = 1;

        System.out.println("Primeiros 20 números da Sequência de Fibonacci:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
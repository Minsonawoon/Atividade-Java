package exercicioslogica;

public class Ex45 {
    public static void main(String[] args) {
//        45) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "while".
        int num1 = 0;
        int num2 = 1;
        int i = 0;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci são:");

        while(i < 20) {
            System.out.print(num1 + " ");

            int somaProximo = num1 + num2;
            num1 = num2;
            num2 = somaProximo;

            i++;
        }
    }
}

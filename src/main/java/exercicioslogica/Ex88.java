package exercicioslogica;
import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
//        88) Escreva um programa que leia 5 números inteiros e calcule a média dos valores pares e a média dos valores ímpares.

                Scanner entrada = new Scanner(System.in);
                int[] numeros = new int[5];
                int somaPares = 0, somaImpares = 0;
                int Pares = 0;
                int Impares = 0;

                System.out.println("Digite 5 números inteiros:");

                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = entrada.nextInt();
                    if (numeros[i] % 2 == 0) {
                        somaPares += numeros[i];
                        Pares++;
                    } else {
                        somaImpares += numeros[i];
                        Impares++;
                    }
                }

                double mediaPares = (Pares > 0) ? (double) somaPares / Pares : 0;
                double mediaImpares = (Impares > 0) ? (double) somaImpares / Impares : 0;

                System.out.println("Média dos valores pares: " + mediaPares);
                System.out.println("Média dos valores ímpares: " + mediaImpares);
            }
        }


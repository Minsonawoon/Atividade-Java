package exercicioslogica;
import java.util.*;

public class Ex92 {
    public static void main(String[] args) {
//        92) Crie um programa que leia 5 números inteiros e exiba-os em ordem decrescente.

        Scanner entrada = new Scanner(System.in);
        Integer[] numeros = new Integer[5];

        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Números em ordem decrescente:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}

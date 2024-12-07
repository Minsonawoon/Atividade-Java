package exercicioslogica;
import java.util.*;

public class Ex95 {
    public static void main(String[] args) {
//        95) Crie um programa que leia 5 nomes e exiba-os em ordem alfabética.
        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = entrada.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}

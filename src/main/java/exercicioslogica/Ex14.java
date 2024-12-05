package exercicioslogica;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//        14) Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias de vida ela tem.

        System.out.println("Os anos:");
        int anos = entrada.nextInt();

        System.out.println("Agora os meses:");
        int meses = entrada.nextInt();

        System.out.println("Agora os dias:");
        int dias = entrada.nextInt();

        anos = anos * 365;
        meses = meses * 30;
        int totalDias = anos + meses + dias;

        System.out.println("Você tem " + totalDias + " dias de vida.");
    }
}

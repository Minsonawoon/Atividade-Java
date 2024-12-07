package exercicioslogica;
import java.util.Scanner;

public class Ex104 {
    public static void main(String[] args) {
//        104) Crie um programa que leia uma matriz 3x3 de números inteiros e verifique se ela é simétrica (igual à sua transposta).

        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean simetrica = true;

        System.out.println("Digite os valores para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
        }

        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
    }
}

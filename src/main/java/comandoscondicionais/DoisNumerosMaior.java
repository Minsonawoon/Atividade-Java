package comandoscondicionais;
import java.util.Scanner;

public class DoisNumerosMaior {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float numero = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        float numero1 = entrada.nextFloat();

        if(numero > numero1) {
            System.out.println(numero + " é maior que " + numero1);
        } else if (numero1 > numero) {
            System.out.println(numero1 + " é maior que " + numero);
        } else {
            System.out.println(numero + " e " + numero1 + " são iguais.");
        }
    }
}

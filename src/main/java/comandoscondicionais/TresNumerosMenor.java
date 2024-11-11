package comandoscondicionais;
import java.util.Scanner;

public class TresNumerosMenor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float numero1 = entrada.nextFloat();

        System.out.println("Digite o segundo número: ");
        float numero2 = entrada.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float numero3 = entrada.nextFloat();

        if(numero1 > numero3 && numero2 > numero3){
            System.out.println("O menor número é: " + numero3);
        } else if (numero1 > numero2 && numero3 > numero2) {
            System.out.println("O menor número é: " + numero2);
        } else if (numero2 > numero1 && numero3 > numero1) {
            System.out.println("O menor número é: " + numero1);
        } else if (numero1 == numero2 && numero2 == numero3){
            System.out.println("Os números são iguais.");
        }

    }
}

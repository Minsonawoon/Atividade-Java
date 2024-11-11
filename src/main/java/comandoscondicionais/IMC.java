package comandoscondicionais;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        float peso = entrada.nextFloat();

        System.out.println("Digite a sua altura: ");
        float altura = entrada.nextFloat();

        float imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso ideal, parabéns");
        } else if (imc >= 25 && imc <= 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau II, severa");
        } else {
            System.out.println("Obesidade III, mórbida");
        }
    }
}

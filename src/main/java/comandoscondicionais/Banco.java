package comandoscondicionais;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro mês de salário: ");
        float salario1 = entrada.nextFloat();

        System.out.println("Digite o segundo mês de salário: ");
        float salario2 = entrada.nextFloat();

        System.out.println("Digite o terceiro mês de salário: ");
        float salario3 = entrada.nextFloat();

        System.out.println("Digite o quarto mês de salário: ");
        float salario4 = entrada.nextFloat();

        System.out.println("Digite o quinto mês de salário: ");
        float salario5 = entrada.nextFloat();

        System.out.println("Digite o sexto mês de salário: ");
        float salario6 = entrada.nextFloat();

        float media = (salario1 + salario2 + salario3 + salario4 + salario5 + salario6) / 6;

        if(media >= 0 && media <= 500){
            System.out.println("Seu saldo é de: " + media + " Você não tem nenhum crédito");
        } else if(media >= 501 && media <= 1000){
            System.out.println("Seu saldo é de: " + media + " Você tem percentual de 30%, igual a: " + (media * 0.30));
        } else if(media >= 1001 && media <= 3000){
            System.out.println("Seu saldo é de: " + media + " Você tem percentual de 40%, igual a: " + (media * 0.40));
        } else {
            System.out.println("Seu saldo é de: " + media + " Você tem percentual de 50%, igual a: " + (media * 0.50));
        }

    }
}

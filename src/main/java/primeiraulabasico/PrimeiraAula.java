package primeiraulabasico; // pacote (pasta de organização das classes)
import java.util.Scanner; // referência da biblioteca Util do Java

public class PrimeiraAula {
    public static void main(String[] args) { // método principal para a execução da classe

        Scanner entrada = new Scanner(System.in); //entrada de dados pelo teclado

        System.out.println("Entre com o primeiro número: "); // permite a exibição em tela
        int numero = entrada.nextInt(); // instância da classe Scanner na variável

        System.out.println("Entre com o segundo número: ");
        int numero2 = entrada.nextInt();

        int soma = numero + numero2; // instância que atribuí valor à soma

        System.out.println("O valor do número é " + numero); // saída dados (estado atual)
        System.out.println("O valor do segundo número é " + numero2);
        System.out.println("A soma dos dois números é " + soma);
    }
}

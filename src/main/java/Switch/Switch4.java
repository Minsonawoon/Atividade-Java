package Switch;
import java.util.Scanner;

public class Switch4 {
    public static void main(String[] args) {
        int cargo;
        String salario;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o código do cargo: ");
        cargo = entrada.nextInt();

        switch(cargo){
            case 0001: salario = "Programador estagiário - salário = 1.400 reais. Novo salário: " + (1400 * 1.10);
            break;
            case 0002: salario = "Programador junior - salário = 3.000 reais. Novo salário: " + (3000 * 1.12);
            break;
            case 0003: salario = "Programador pleno - salário = 5.500 reais. Novo salário: " + (5500 * 1.13);
            break;
            case 0004: salario = "Programador senior - salário = 8.000 reais. Novo salário: " + (8000 * 1.15);
            break;
            case 0005: salario = "Programador master - salário = 12.000 reais. Novo salário: " + (12000 * 1.18);
            break;
            default: salario = "Digite um cargo válido!";
        }
        System.out.println(salario);
    }
}

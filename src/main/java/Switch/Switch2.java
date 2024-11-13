package Switch;
import java.util.*;

public class Switch2 {
    public static void main(String[] args) {
        int numeromes;
        String mes;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número para saber o mês: ");
        numeromes = entrada.nextInt();

        switch(numeromes){
            case 1: mes = "Janeiro";
            break;
            case 2: mes = "Fevereiro";
            break;
            case 3: mes = "Março";
            break;
            case 4: mes = "Abril";
            break;
            case 5: mes = "Maio";
            break;
            case 6: mes = "Junho";
            break;
            case 7: mes = "Julho";
            break;
            case 8: mes = "Agosto";
            break;
            case 9: mes = "Setembro";
            break;
            case 10: mes = "Outubro";
            break;
            case 11: mes = "Novembro";
            break;
            case 12: mes = "Dezembro";
            break;
            default: mes = "Digite um número válido.";
        }

        System.out.println(mes);

    }
}

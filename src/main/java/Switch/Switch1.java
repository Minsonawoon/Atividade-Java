package Switch;
import java.util.*;

public class Switch1 {
    public static void main(String[] args) {
        int farol;
        String mensagem;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        farol = entrada.nextInt();

        switch (farol){
            case 1: mensagem = "Farol verde! Siga.";
            break;
            case 2: mensagem = "Farol amarelo! Atenção, reduza a velocidade.";
            break;
            case 3: mensagem = "Farol vermelho! Pare.";
            break;
            default: mensagem = "Número inválido";
        }

        System.out.println(mensagem);
    }
}

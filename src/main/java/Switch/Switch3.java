package Switch;
import java.util.*;

public class Switch3 {
    public static void main(String[] args) {
        int combo;
        String descricao;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um combo: ");
        combo = entrada.nextInt();

        switch(combo){
            case 1: descricao = "CHEESE CHICKEN CRISPY: pão, molho rosé, queijo tipo cheddar, alface e tomate";
            break;
            case 2: descricao = "X-SALADA: pão, molho rosé, queijo tipo cheddar, picles";
            break;
            case 3: descricao = "CHEESEBURGER: pão, molho rosé, queijo tipo cheddar";
            break;
            case 4: descricao = "SOBRECOXA CRISPY: sobrecoxa desossada crocante 130 g";
            break;
            case 5: descricao = "BALDES - FRANGO EMPANADO CROCANTE: 4 tirinhas + batata frita (60g) ou 4 pedaços + batata frita (60g) ou 2 pedaços + 2 tirinhas + batata frita ";
            break;
            default: descricao = "Número do combo inválido!";
        }
        System.out.println(descricao);
    }
}

package ex13;

public class Ex13 {
    public static void main(String[] args) {
        FestaFamilia f1 = new FestaFamilia();
        FestaEmpresa f2 = new FestaEmpresa();

        f1.setNomeAniversariante("Sandra");
        f2.setNomeAniversariante("Jason");

        f1.setAlugarLocal(false);
        f2.setAlugarLocal(true);

        f1.setConvidadosFesta(15);
        f2.setConvidadosFesta(42);

        f1.setSaborBolo("Maracujá");
        f2.setSaborBolo("Chocolate");

        f1.setValorFesta(241.00f);
        f2.setValorFesta(1200.75f);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}

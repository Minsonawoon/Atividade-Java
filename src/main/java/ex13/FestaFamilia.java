package ex13;

public class FestaFamilia extends FestaDeAniversario{
    private boolean convite;

    public void convitesEscritos () {
        this.convite = true;
    }

    public boolean isConvite() {
        return convite;
    }

    public void setConvite(boolean convite) {
        this.convite = convite;
    }
}

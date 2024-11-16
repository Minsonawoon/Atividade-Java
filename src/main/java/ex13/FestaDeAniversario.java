package ex13;

abstract class FestaDeAniversario {
    private String nomeAniversariante;
    private boolean alugarLocal;
    private int convidadosFesta;
    private String saborBolo;
    private float valorFesta;

    public String getNomeAniversariante() {
        return nomeAniversariante;
    }

    public void setNomeAniversariante(String nomeAniversariante) {
        this.nomeAniversariante = nomeAniversariante;
    }

    public boolean isAlugarLocal() {
        return alugarLocal;
    }

    public void setAlugarLocal(boolean alugarLocal) {
        this.alugarLocal = alugarLocal;
    }

    public int getConvidadosFesta() {
        return convidadosFesta;
    }

    public void setConvidadosFesta(int convidadosFesta) {
        this.convidadosFesta = convidadosFesta;
    }

    public String getSaborBolo() {
        return saborBolo;
    }

    public void setSaborBolo(String saborBolo) {
        this.saborBolo = saborBolo;
    }

    public float getValorFesta() {
        return valorFesta;
    }

    public void setValorFesta(float valorFesta) {
        this.valorFesta = valorFesta;
    }

    @Override
    public String toString() {
        return "FestaDeAniversario{" +
                "nomeAniversariante='" + nomeAniversariante + '\'' +
                ", alugarLocal=" + alugarLocal +
                ", convidadosFesta=" + convidadosFesta +
                ", saborBolo='" + saborBolo + '\'' +
                ", valorFesta=" + valorFesta +
                '}';
    }
}


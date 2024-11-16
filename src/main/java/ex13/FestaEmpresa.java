package ex13;

public class FestaEmpresa extends FestaDeAniversario{
    private boolean diaFolga;

    public void teraFolga() {
        this.diaFolga = true;
    }

    public void semFolga() {
        this.diaFolga = false;
    }

    public boolean isDiaFolga() {
        return diaFolga;
    }

    public void setDiaFolga(boolean diaFolga) {
        this.diaFolga = diaFolga;
    }
}

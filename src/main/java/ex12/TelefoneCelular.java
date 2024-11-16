package ex12;

public class TelefoneCelular {
    public String modelo;
    private int armazenamento;
    private boolean ligado;
    private String tela;
    private float tamanhoTela;

    public TelefoneCelular(String m, int a, String t, float tam) {
        this.modelo = m;
        this.armazenamento = a;
        this.tela = t;
        this.tamanhoTela = tam;
        this.ligado = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public float getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(float tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public void ligarCelular() {
        this.ligado = true;
    }

    public void desligarCelular() {
        this.ligado = false;
    }

    public void status() {
        System.out.println("Sobre o celular: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Armazenamento: " + this.getArmazenamento());
        System.out.println("Tipo da tela: " + this.getTela());
        System.out.println("Tamanho da tela: " + this.getTamanhoTela());
        System.out.println("Está ligado? " + this.ligado);
    }
}

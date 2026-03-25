package exercicio11_sistema_de_dispositivos_eletronicos;

public class Tablet extends Dispositivo {
    private double tamanhoTela;
    private boolean possuiCaneta;
    private int bateria;

    public Tablet(String marca, String modelo, boolean ligado,
            double tamanhoTela, boolean possuiCaneta, int bateria) {
        super(marca, modelo, ligado);
        this.tamanhoTela = tamanhoTela;
        this.possuiCaneta = possuiCaneta;
        this.bateria = bateria;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public boolean isPossuiCaneta() {
        return possuiCaneta;
    }

    public void setPossuiCaneta(boolean possuiCaneta) {
        this.possuiCaneta = possuiCaneta;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    
    @Override
    public void executarFuncao() {
        System.out.println("Tablet esta sendo usado para jogar");
    }
}

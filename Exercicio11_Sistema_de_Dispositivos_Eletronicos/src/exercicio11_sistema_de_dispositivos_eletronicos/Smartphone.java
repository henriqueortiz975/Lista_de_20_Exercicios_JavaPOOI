package exercicio11_sistema_de_dispositivos_eletronicos;

public class Smartphone extends Dispositivo {
    private String sistemaOperacional;
    private int armazenamento;
    private boolean possui5G;

    public Smartphone(String marca, String modelo, boolean ligado,
            String sistemaOperacional, int armazenamento, boolean possui5G) {
        super(marca, modelo, ligado);
        this.sistemaOperacional = sistemaOperacional;
        this.armazenamento = armazenamento;
        this.possui5G = possui5G;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isPossui5G() {
        return possui5G;
    }

    public void setPossui5G(boolean possui5G) {
        this.possui5G = possui5G;
    }
    
    @Override
    public void executarFuncao() {
        System.out.println("Smartphone acessando aplicativos");
    }
}

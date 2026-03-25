package exercicio11_sistema_de_dispositivos_eletronicos;

public class Televisao extends Dispositivo {
    private int tamanhoPolegadas;
    private String resolucao;
    private boolean smartTV;

    public Televisao(String marca, String modelo, boolean ligado,
            int tamanhoPolegadas, String resolucao, boolean smartTV) {
        super(marca, modelo, ligado);
        this.tamanhoPolegadas = tamanhoPolegadas;
        this.resolucao = resolucao;
        this.smartTV = smartTV;
    }

    public int getTamanhoPolegadas() {
        return tamanhoPolegadas;
    }

    public void setTamanhoPolegadas(int tamanhoPolegadas) {
        this.tamanhoPolegadas = tamanhoPolegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }
    
    @Override
    public void executarFuncao() {
        System.out.println("Televisão reproduzindo Jornal Nacional");
    }
}

package exercicio10_sistema_de_transporte;

public class Onibus extends Transporte {
    private int numeroParadas;
    private double taxaParada;
    private String linha;

    public Onibus(int capacidade, String empresa, double tarifaBase,
            int numeroParadas, double taxaParada, String linha) {
        super(capacidade, empresa, tarifaBase);
        this.numeroParadas = numeroParadas;
        this.taxaParada = taxaParada;
        this.linha = linha;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    public double getTaxaParada() {
        return taxaParada;
    }

    public void setTaxaParada(double taxaParada) {
        this.taxaParada = taxaParada;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }
    
    @Override
    public double calcularTarifa() {
        return getTarifaBase() + (numeroParadas * taxaParada);
    }
}

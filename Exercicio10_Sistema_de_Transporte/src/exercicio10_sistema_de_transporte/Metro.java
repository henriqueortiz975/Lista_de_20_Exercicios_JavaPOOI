package exercicio10_sistema_de_transporte;

public class Metro extends Transporte {
    private int estacoes;
    private double tarifaPorEstacao;
    private String linha;

    public Metro(int capacidade, String empresa, double tarifaBase,
            int estacoes, double tarifaPorEstacao, String linha) {
        super(capacidade, empresa, tarifaBase);
        this.estacoes = estacoes;
        this.tarifaPorEstacao = tarifaPorEstacao;
        this.linha = linha;
    }

    public int getEstacoes() {
        return estacoes;
    }

    public void setEstacoes(int estacoes) {
        this.estacoes = estacoes;
    }

    public double getTarifaPorEstacao() {
        return tarifaPorEstacao;
    }

    public void setTarifaPorEstacao(double tarifaPorEstacao) {
        this.tarifaPorEstacao = tarifaPorEstacao;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }
    
    @Override
    public double calcularTarifa() {
        return getTarifaBase() + (estacoes * tarifaPorEstacao);
    }
}

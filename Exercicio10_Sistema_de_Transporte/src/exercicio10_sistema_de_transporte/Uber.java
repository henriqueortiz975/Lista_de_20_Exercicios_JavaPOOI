package exercicio10_sistema_de_transporte;

public class Uber extends Transporte {
    private double distancia;
    private double multiplicador;
    private String tipoServico;

    public Uber(int capacidade, String empresa, double tarifaBase,
            double distancia, double multiplicador, String tipoServico) {
        super(capacidade, empresa, tarifaBase);
        this.distancia = distancia;
        this.multiplicador = multiplicador;
        this.tipoServico = tipoServico;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }
    
    @Override
    public double calcularTarifa() {
        return (getTarifaBase() + distancia * 2) * multiplicador;
    }
}

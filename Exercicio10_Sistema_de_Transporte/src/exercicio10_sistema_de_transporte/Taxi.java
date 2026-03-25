package exercicio10_sistema_de_transporte;

public class Taxi extends Transporte {
    private double distancia;
    private double valorPorKm;
    private String bandeira;

    public Taxi(int capacidade, String empresa, double tarifaBase,
            double distancia, double valorPorKm, String bandeira) {
        super(capacidade, empresa, tarifaBase);
        this.distancia = distancia;
        this.valorPorKm = valorPorKm;
        this.bandeira = bandeira;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    
    @Override
    public double calcularTarifa() {
        return getTarifaBase() + (distancia * valorPorKm);
    }
}

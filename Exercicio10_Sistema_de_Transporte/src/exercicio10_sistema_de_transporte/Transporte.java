package exercicio10_sistema_de_transporte;

public class Transporte {
    private int capacidade;
    private String empresa;
    private double tarifaBase;

    public Transporte(int capacidade, String empresa, double tarifaBase) {
        this.capacidade = capacidade;
        this.empresa = empresa;
        this.tarifaBase = tarifaBase;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }
    
    public double calcularTarifa() {
        return tarifaBase;
    }

    public void exibir() {
        System.out.println("Empresa: " + getEmpresa());
        System.out.println("Tarifa: R$ " + calcularTarifa());
    }
}

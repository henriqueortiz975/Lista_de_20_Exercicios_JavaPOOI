package exercicio6_sistema_de_produtos;

public class Eletronico extends Produto {
    private String marca;
    private int garantiaMeses;
    private double taxaImposto;

    public Eletronico(String nome, double preco, int quantidade, String marca, int garantiaMeses, double taxaImposto) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
        this.taxaImposto = taxaImposto;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() + (getPreco() * taxaImposto);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public double getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }
}

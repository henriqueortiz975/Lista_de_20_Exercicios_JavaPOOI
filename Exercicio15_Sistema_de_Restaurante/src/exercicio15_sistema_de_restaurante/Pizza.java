package exercicio15_sistema_de_restaurante;

public class Pizza extends ItemCardapio {
    private String tamanho;
    private int quantidadeSabores;
    private double taxaExtra;

    public Pizza(String nome, double preco, String descricao, String tamanho,
            int quantidadeSabores, double taxaExtra) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.quantidadeSabores = quantidadeSabores;
        this.taxaExtra = taxaExtra;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidadeSabores() {
        return quantidadeSabores;
    }

    public void setQuantidadeSabores(int quantidadeSabores) {
        this.quantidadeSabores = quantidadeSabores;
    }

    public double getTaxaExtra() {
        return taxaExtra;
    }

    public void setTaxaExtra(double taxaExtra) {
        this.taxaExtra = taxaExtra;
    }
    
    @Override
    public void preparar() {
        System.out.println("Preparando pizza " + getNome() + " tamanho " + getTamanho());
    }

    @Override
    public double calcularPreco() {
        return getPreco() + getTaxaExtra();
    }
}
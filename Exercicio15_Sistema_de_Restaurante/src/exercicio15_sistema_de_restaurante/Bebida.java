package exercicio15_sistema_de_restaurante;

public class Bebida extends ItemCardapio {
    private String tamanho;
    private double taxaServico;

    public Bebida(String nome, double preco, String descricao,
            String tamanho, boolean gelada, double taxaServico) {
        super(nome, preco, descricao);
        this.tamanho = tamanho;
        this.taxaServico = taxaServico;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }
    
    @Override
    public void preparar() {
        System.out.println("Servindo bebida");
    }

    @Override
    public double calcularPreco() {
        return getPreco() + getTaxaServico();
    }
}

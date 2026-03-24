package exercicio6_sistema_de_produtos;

public class Roupa extends Produto {
    private String tamanho;
    private String cor;
    private double desconto;

    public Roupa(String nome, double preco, int quantidade, String tamanho, String cor, double desconto) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
        this.cor = cor;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() - (getPreco() * desconto);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}

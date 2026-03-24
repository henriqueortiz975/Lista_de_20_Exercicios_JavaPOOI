package exercicio6_sistema_de_produtos;

public class Alimento extends Produto {
    private String dataValidade;
    private boolean perecivel;
    private double desconto;

    public Alimento(String nome, double preco, int quantidade, String dataValidade, boolean perecivel, double desconto) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
        this.perecivel = perecivel;
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        if (perecivel) {
            return getPreco() - (getPreco() * desconto);
        }
        return getPreco();
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
package exercicio15_sistema_de_restaurante;

public class Sobremesa extends ItemCardapio {
    private String tipo;
    private double desconto;

    public Sobremesa(String nome, double preco, String descricao, String tipo, double desconto) {
        super(nome, preco, descricao);
        this.tipo = tipo;
        this.desconto = desconto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    @Override
    public void preparar() {
        System.out.println("Preparando sobremesa " + getTipo());
    }

    @Override
    public double calcularPreco() {
        return getPreco() - (getPreco() * getDesconto());
    }
}

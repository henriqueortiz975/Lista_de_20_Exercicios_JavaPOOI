package exercicio15_sistema_de_restaurante;

public class Hamburguer extends ItemCardapio {
    private boolean artesanal;
    private int quantidadeAdicionais;
    private double valorAdicional;

    public Hamburguer(String nome, double preco, String descricao, boolean artesanal,
            int quantidadeAdicionais, double valorAdicional) {
        super(nome, preco, descricao);
        this.artesanal = artesanal;
        this.quantidadeAdicionais = quantidadeAdicionais;
        this.valorAdicional = valorAdicional;
    }

    public boolean GetArtesanal() {
        return artesanal;
    }

    public void setArtesanal(boolean artesanal) {
        this.artesanal = artesanal;
    }

    public int getQuantidadeAdicionais() {
        return quantidadeAdicionais;
    }

    public void setQuantidadeAdicionais(int quantidadeAdicionais) {
        this.quantidadeAdicionais = quantidadeAdicionais;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    @Override
    public void preparar() {
        System.out.println("Montando hambúrguer " + getNome());
    }

    @Override
    public double calcularPreco() {
        return getPreco() + (getQuantidadeAdicionais() * getValorAdicional());
    }
}

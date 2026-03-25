package exercicio18_sistema_de_imoveis;

public class Imovel {
    private String endereco;
    private double preco;
    private double metragem;

    public Imovel(String endereco, double preco, double metragem) {
        this.endereco = endereco;
        this.preco = preco;
        this.metragem = metragem;
    }

    public String getEndereco() { 
        return endereco; 
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() { 
        return preco; 
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getMetragem() { 
        return metragem; 
    }
    
    public void setMetragem(double metragem) { 
        this.metragem = metragem;
    }
    
    public double calcularImposto() {
        return preco * 0.01;
    }

    public void exibir() {
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Preço: R$ " + getPreco());
        System.out.println("Metragem: " + getMetragem() + " m²");
        System.out.println("Imposto: R$ " + calcularImposto());
    }
}

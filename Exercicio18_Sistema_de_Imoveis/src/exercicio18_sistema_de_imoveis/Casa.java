package exercicio18_sistema_de_imoveis;

public class Casa extends Imovel {
    private int quartos;
    private boolean temGaragem;
    private double areaJardim;

    public Casa(String endereco, double preco, double metragem,
                int quartos, boolean temGaragem, double areaJardim) {
        super(endereco, preco, metragem);
        this.quartos = quartos;
        this.temGaragem = temGaragem;
        this.areaJardim = areaJardim;
    }

    public int getQuartos() { 
        return quartos; 
    }
    
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public boolean getTemGaragem() {
        return temGaragem; 
    }
    
    public void setTemGaragem(boolean temGaragem) { 
        this.temGaragem = temGaragem;
    }

    public double getAreaJardim() {
        return areaJardim;
    }
    
    public void setAreaJardim(double areaJardim) {
        this.areaJardim = areaJardim; 
    }
    
    @Override
    public double calcularImposto() {
        return getPreco() * 0.015;
    }
}

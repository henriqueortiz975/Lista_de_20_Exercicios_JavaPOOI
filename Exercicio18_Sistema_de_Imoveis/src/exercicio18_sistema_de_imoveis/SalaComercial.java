package exercicio18_sistema_de_imoveis;

public class SalaComercial extends Imovel {
    private String tipoNegocio;
    private boolean emShopping;
    private double taxaCondominio;

    public SalaComercial(String endereco, double preco, double metragem,
                         String tipoNegocio, boolean emShopping, double taxaCondominio) {
        super(endereco, preco, metragem);
        this.tipoNegocio = tipoNegocio;
        this.emShopping = emShopping;
        this.taxaCondominio = taxaCondominio;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }
    
    public void setTipoNegocio(String tipoNegocio) { 
        this.tipoNegocio = tipoNegocio;
    }

    public boolean getEmShopping() { 
        return emShopping; 
    }
    
    public void setEmShopping(boolean emShopping) {
        this.emShopping = emShopping;
    }

    public double getTaxaCondominio() {
        return taxaCondominio;
    }
    
    public void setTaxaCondominio(double taxaCondominio) { 
        this.taxaCondominio = taxaCondominio; 
    }
    
    @Override
    public double calcularImposto() {
        return getPreco() * 0.025 + getTaxaCondominio();
    }
}

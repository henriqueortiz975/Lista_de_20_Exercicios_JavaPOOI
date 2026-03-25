package exercicio18_sistema_de_imoveis;

public class Apartamento extends Imovel {
    private int andar;
    private double condominio;
    private boolean temElevador;

    public Apartamento(String endereco, double preco, double metragem,
                       int andar, double condominio, boolean temElevador) {
        super(endereco, preco, metragem);
        this.andar = andar;
        this.condominio = condominio;
        this.temElevador = temElevador;
    }

    public int getAndar() { 
        return andar; 
    }
    
    public void setAndar(int andar) { 
        this.andar = andar;
    }

    public double getCondominio() {
        return condominio; 
    }
    
    public void setCondominio(double condominio) { 
        this.condominio = condominio; 
    }

    public boolean getTemElevador() { 
        return temElevador; 
    }
    
    public void setTemElevador(boolean temElevador) { 
        this.temElevador = temElevador; 
    }
    
    @Override
    public double calcularImposto() {
        return getPreco() * 0.02 + getCondominio();
    }
}
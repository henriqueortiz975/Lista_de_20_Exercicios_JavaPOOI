package exercicio18_sistema_de_imoveis;

public class Terreno extends Imovel {
    private String tipoSolo;
    private boolean plano;
    private boolean temInfraestrutura;

    public Terreno(String endereco, double preco, double metragem,
                   String tipoSolo, boolean plano, boolean temInfraestrutura) {
        super(endereco, preco, metragem);
        this.tipoSolo = tipoSolo;
        this.plano = plano;
        this.temInfraestrutura = temInfraestrutura;
    }

    public String getTipoSolo() { 
        return tipoSolo; 
    }
    
    public void setTipoSolo(String tipoSolo) { 
        this.tipoSolo = tipoSolo;
    }

    public boolean isPlano() {
        return plano; 
    }
    
    public void setPlano(boolean plano) {
        this.plano = plano; 
    }

    public boolean getTemInfraestrutura() { 
        return temInfraestrutura; 
    }
    
    public void setTemInfraestrutura(boolean temInfraestrutura) {
        this.temInfraestrutura = temInfraestrutura; 
    }
    
    @Override
    public double calcularImposto() {
        return getPreco() * 0.01;
    }
}

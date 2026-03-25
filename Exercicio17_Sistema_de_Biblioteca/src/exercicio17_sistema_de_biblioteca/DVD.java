package exercicio17_sistema_de_biblioteca;

public class DVD extends ItemBiblioteca {
    private String genero;
    private int duracao;
    private double multaPorDia;

    public DVD(String titulo, String codigo, boolean disponivel,
               String genero, int duracao, double multaPorDia) {
        super(titulo, codigo, disponivel);
        this.genero = genero;
        this.duracao = duracao;
        this.multaPorDia = multaPorDia;
    }

    public String getGenero() {
        return genero; 
    }
    
    public void setGenero(String genero) {
        this.genero = genero; 
    }

    public int getDuracao() {
        return duracao; 
    }
    
    public void setDuracao(int duracao) { 
        this.duracao = duracao; 
    }

    public double getMultaPorDia() {
        return multaPorDia; 
    }
    
    public void setMultaPorDia(double multaPorDia) {
        this.multaPorDia = multaPorDia; 
    }
    
    @Override
    public void emprestar() {
        if (getDisponivel()) {
            setDisponivel(false);
            System.out.println("DVD emprestado. Multa: R$ " + getMultaPorDia() + " por dia");
        } else {
            System.out.println("DVD indisponível");
        }
    }
}

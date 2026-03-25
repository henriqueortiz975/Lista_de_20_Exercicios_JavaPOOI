package exercicio20_sistema_de_zoologico;

public class Elefante extends Animal {
    private double tamanhoTromba;
    private boolean africano;
    private int forca;

    public Elefante(String nome, int idade, double peso,
                    double tamanhoTromba, boolean africano, int forca) {
        super(nome, idade, peso);
        this.tamanhoTromba = tamanhoTromba;
        this.africano = africano;
        this.forca = forca;
    }

    public double getTamanhoTromba() {
        return tamanhoTromba;
    }
    
    public void setTamanhoTromba(double tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba; 
    }

    public boolean isAfricano() {
        return africano; 
    }
    
    public void setAfricano(boolean africano) {
        this.africano = africano; 
    }

    public int getForca() {
        return forca;
    }
    
    public void setForca(int forca) { 
        this.forca = forca; 
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Elefante trombeteando");
    }

    @Override
    public void alimentar() {
        System.out.println("Elefante comendo plantas");
    }

    @Override
    public void movimentar() {
        System.out.println("Elefante andando lentamente");
    }
}

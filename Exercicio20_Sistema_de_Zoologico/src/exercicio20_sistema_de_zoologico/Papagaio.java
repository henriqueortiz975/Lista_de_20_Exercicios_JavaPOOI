package exercicio20_sistema_de_zoologico;

public class Papagaio extends Animal {
    private String cor;
    private boolean fala;
    private int vocabulario;

    public Papagaio(String nome, int idade, double peso,
                    String cor, boolean fala, int vocabulario) {
        super(nome, idade, peso);
        this.cor = cor;
        this.fala = fala;
        this.vocabulario = vocabulario;
    }

    public String getCor() {
        return cor; 
    }
    
    public void setCor(String cor) { 
        this.cor = cor; 
    }

    public boolean isFala() { 
        return fala; 
    }
    
    public void setFala(boolean fala) { 
        this.fala = fala; 
    }

    public int getVocabulario() { 
        return vocabulario; 
    }
    
    public void setVocabulario(int vocabulario) {
        this.vocabulario = vocabulario; 
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Papagaio falando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Papagaio comendo sementes.");
    }

    @Override
    public void movimentar() {
        System.out.println("Papagaio voando.");
    }
}

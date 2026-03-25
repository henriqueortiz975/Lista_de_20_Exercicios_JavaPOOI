package exercicio20_sistema_de_zoologico;

public class Leao extends Animal {
    private String habitat;
    private boolean alfa;
    private int quantidadeJuba;

    public Leao(String nome, int idade, double peso,
                String habitat, boolean alfa, int quantidadeJuba) {
        super(nome, idade, peso);
        this.habitat = habitat;
        this.alfa = alfa;
        this.quantidadeJuba = quantidadeJuba;
    }

    public String getHabitat() {
        return habitat; 
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat; 
    }

    public boolean isAlfa() {
        return alfa; 
    }
    
    public void setAlfa(boolean alfa) {
        this.alfa = alfa;
    }

    public int getQuantidadeJuba() {
        return quantidadeJuba; 
    }
    
    public void setQuantidadeJuba(int quantidadeJuba) {
        this.quantidadeJuba = quantidadeJuba;
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Leão rugnido");
    }

    @Override
    public void alimentar() {
        System.out.println("Leão comendo carne");
    }

    @Override
    public void movimentar() {
        System.out.println("Leão correndo");
    }
}

package exercicio20_sistema_de_zoologico;

public class Macaco extends Animal {
    private String especie;
    private boolean sobeArvores;
    private int nivelAgilidade;

    public Macaco(String nome, int idade, double peso,
                  String especie, boolean sobeArvores, int nivelAgilidade) {
        super(nome, idade, peso);
        this.especie = especie;
        this.sobeArvores = sobeArvores;
        this.nivelAgilidade = nivelAgilidade;
    }

    public String getEspecie() {
        return especie; 
    }
    
    public void setEspecie(String especie) { 
        this.especie = especie; 
    }

    public boolean isSobeArvores() {
        return sobeArvores; 
    }
    
    public void setSobeArvores(boolean sobeArvores) { 
        this.sobeArvores = sobeArvores;
    }

    public int getNivelAgilidade() {
        return nivelAgilidade; 
    }
    
    public void setNivelAgilidade(int nivelAgilidade) {
        this.nivelAgilidade = nivelAgilidade; 
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Macaco gritando");
    }

    @Override
    public void alimentar() {
        System.out.println("Macaco comendo frutas");
    }

    @Override
    public void movimentar() {
        System.out.println("Macaco pulando entre árvores");
    }
}

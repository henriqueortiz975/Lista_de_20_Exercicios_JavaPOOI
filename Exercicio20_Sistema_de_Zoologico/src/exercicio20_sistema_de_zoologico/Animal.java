package exercicio20_sistema_de_zoologico;

public class Animal {
    private String nome;
    private int idade;
    private double peso;

    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome; 
    }
    
    public void setNome(String nome) {
        this.nome = nome; 
    }

    public int getIdade() {
        return idade; 
    }
    
    public void setIdade(int idade) { 
        this.idade = idade; 
    }

    public double getPeso() {
        return peso; 
    }
    
    public void setPeso(double peso) {
        this.peso = peso; 
    }
    
    public void emitirSom() {
        System.out.println("Animal fazendo som");
    }

    public void alimentar() {
        System.out.println("Animal se alimentando");
    }

    public void movimentar() {
        System.out.println("Animal se movimentando");
    }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso() + " kg");
    }
}

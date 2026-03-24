package exercicio1_.sistema_de_animais;

public class Animal {
    private String nome;
    private int idade;
    private double peso;
    
    public Animal(String nome, int idade, double peso){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getpeso(){
        return peso;
    }
    
    public void emitirSom(){
        System.out.println("O animal faz barulho");
    }
    
}

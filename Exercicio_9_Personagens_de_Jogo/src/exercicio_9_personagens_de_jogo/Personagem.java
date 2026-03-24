package exercicio_9_personagens_de_jogo;

public class Personagem {
    private String nome;
    private double vida;
    private int nivel;
    
    public Personagem(String nome, double vida, int nivel){
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setVida(double vida){
        this.vida = vida;
    }
    
    public double getVida(){
        return vida;
    }
    
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public void atacar(){
        System.out.println("Atacou usando: ");
    }
    
    public void defender(){
        System.out.println("Se defendeu");
    }
    
}

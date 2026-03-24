package exercicio_9_personagens_de_jogo;

public class Guerreiro extends Personagem{
    private double danoEspada;
    
    public Guerreiro(String nome, double vida, int nivel, double danoEspada) {
        super(nome, vida, nivel);
        this.danoEspada = danoEspada;
    }
    
    public void setDanoEspada(double espadaDano){
        this.danoEspada = espadaDano;
    }
    
    public double getDanoEspada(){
        return danoEspada;
    }
    
    @Override
    public void atacar(){
        System.out.println("Atacou usando Espada e dando o dano de " + getDanoEspada());
    }
    
    @Override
    public void defender(){
        System.out.println("Se defendeu");
    }
    
}

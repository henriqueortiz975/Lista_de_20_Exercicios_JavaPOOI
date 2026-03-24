package exercicio_9_personagens_de_jogo;

public class Arqueiro extends Personagem{
    private double danoArco;
            
    public Arqueiro(String nome, double vida, int nivel, double danoArco) {
        super(nome, vida, nivel);
        this.danoArco = danoArco;
    }
    
    public void setDanoArco(double danoArco){
        this.danoArco = danoArco;
    }
    
    public double getDanoArco(){
        return danoArco;
    }
    
    @Override
    public void atacar(){
        System.out.println("Atacou usando arco e dando o dano de " + getDanoArco());
    }
    
    @Override
    public void defender(){
        System.out.println("Se defendeu");
    } 
    
}

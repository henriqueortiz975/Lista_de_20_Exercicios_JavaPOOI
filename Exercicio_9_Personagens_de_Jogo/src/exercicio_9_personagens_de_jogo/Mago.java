package exercicio_9_personagens_de_jogo;

public class Mago extends Personagem{
    private double danoMagia;
    
    public Mago(String nome, double vida, int nivel, double danoMagia) {
        super(nome, vida, nivel);
        this.danoMagia = danoMagia;
    }
    
    public void setDanoMagia(double danoMagia){
        this.danoMagia = danoMagia;
    }
    
    public double getDanoMagia(){
        return danoMagia;
    }
    
    @Override
    public void atacar(){
        System.out.println("Atacou usando magia de gelo e dando o dano de " + getDanoMagia());
    }
    
    @Override
    public void defender(){
        System.out.println("Se defendeu");
    } 
}

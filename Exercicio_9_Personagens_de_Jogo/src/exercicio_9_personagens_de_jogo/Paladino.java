package exercicio_9_personagens_de_jogo;

public class Paladino extends Personagem{
    private double danoMachado;
    
    public Paladino(String nome, double vida, int nivel, double danoMachado) {
        super(nome, vida, nivel);
        this.danoMachado = danoMachado;
    }
    
    public void setDanoMachado(double danoMachado){
        this.danoMachado = danoMachado;
    }
    
    public double getDanoMachado(){
        return danoMachado;
    }
    
    @Override
    public void atacar(){
        System.out.println("Atacou usando machado e dando o dano de " + getDanoMachado());
    }
    
    @Override
    public void defender(){
        System.out.println("Se defendeu");
    } 
}

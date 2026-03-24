package exercicio1_.sistema_de_animais;

public class Cavalo extends Animal{
    private double velocidade;
    
    public Cavalo(String nome, int idade, double peso, double velocidade) {
        super(nome, idade, peso);
        this.velocidade = velocidade;
    }
    
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
    @Override
    public void emitirSom(){
        System.out.println("ihihi");
    }
    
}

package exercicio2_sistema_de_veiculos;

public class Moto extends Veiculo{
    private double velocidade;
    
    public Moto(String marca, String modelo, int ano, double velocidade) {
        super(marca, modelo, ano);
        this.velocidade = velocidade;
    }
    
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
    @Override
    public void mover(){
        System.out.println("Se movimento em: " + getVelocidade() + "Km em duas rodas");
    }
    
}

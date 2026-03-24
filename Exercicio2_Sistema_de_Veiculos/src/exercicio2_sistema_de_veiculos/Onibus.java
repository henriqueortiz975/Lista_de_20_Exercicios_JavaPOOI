package exercicio2_sistema_de_veiculos;

public class Onibus extends Veiculo{
    private double velocidade;
    
    public Onibus(String marca, String modelo, int ano, double velocidade) {
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
        System.out.println("Se movimenta em: " + getVelocidade() + "Km em quatro rodas");
    }
    
}

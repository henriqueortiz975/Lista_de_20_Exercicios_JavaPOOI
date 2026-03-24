package exercicio1_.sistema_de_animais;

public class Vaca extends Animal{
    private double quantidadeLeite;
    
    public Vaca(String nome, int idade, double peso, double quantidadeLeite) {
        super(nome, idade, peso);
        this.quantidadeLeite = quantidadeLeite;
    }
    
    public void setQuantidadeLeite(double quantidadeLeite){
        this.quantidadeLeite = quantidadeLeite;
    }
    
    public double getQuantidadeLeite(){
        return quantidadeLeite;
    }
    
    public void emitirSom(){
        System.out.println("Muuh");
    }
    
}

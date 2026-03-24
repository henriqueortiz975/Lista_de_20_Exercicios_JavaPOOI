package exercicio1_.sistema_de_animais;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso);
        this.raca = raca; 
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public String getRaca(){
        return raca;
    }
   
    @Override
    public void emitirSom(){
        System.out.println("Latido");
    }
    
}

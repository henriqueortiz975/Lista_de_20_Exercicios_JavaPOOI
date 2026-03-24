package exercicio2_sistema_de_veiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    
    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void mover(){
        System.out.println("Em Movimento");
    }
    
}

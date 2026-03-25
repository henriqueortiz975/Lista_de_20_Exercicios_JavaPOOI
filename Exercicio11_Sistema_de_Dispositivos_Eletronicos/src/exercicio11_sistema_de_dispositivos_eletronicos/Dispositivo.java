package exercicio11_sistema_de_dispositivos_eletronicos;

public class Dispositivo {
    private String marca;
    private String modelo;
    private boolean ligado;

    public Dispositivo(String marca, String modelo, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void ligar() {
        if(ligado == true){
            System.out.println("Dispositivo ligado");
        }else{
            System.out.println("Dispositivo desligado");
        }
    }

    public void executarFuncao() {
        System.out.println("Executando função");
    }
}

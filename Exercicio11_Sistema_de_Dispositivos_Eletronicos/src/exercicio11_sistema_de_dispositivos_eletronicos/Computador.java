package exercicio11_sistema_de_dispositivos_eletronicos;

public class Computador extends Dispositivo {
    private int memoriaRAM;
    private String processador;
    private int armazenamento;

    public Computador(String marca, String modelo, boolean ligado,
            int memoriaRAM, String processador, int armazenamento) {
        super(marca, modelo, ligado);
        this.memoriaRAM = memoriaRAM;
        this.processador = processador;
        this.armazenamento = armazenamento;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
    
    @Override
    public void executarFuncao() {
        System.out.println("Computador executando programas");
    }
}

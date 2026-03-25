package exercicio12_sistema_de_profissoes;

public class Engenheiro extends Profissao {
    private String tipoEngenharia;
    private String registro;
    private int projetos;

    public Engenheiro(String nome, String area, double salario, String tipoEngenharia, String registro, int projetos) {
        super(nome, area, salario);
        this.tipoEngenharia = tipoEngenharia;
        this.registro = registro;
        this.projetos = projetos;
    }

    public String getTipoEngenharia() {
        return tipoEngenharia;
    }

    public void setTipoEngenharia(String tipoEngenharia) {
        this.tipoEngenharia = tipoEngenharia;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public int getProjetos() {
        return projetos;
    }

    public void setProjetos(int projetos) {
        this.projetos = projetos;
    }
    
    @Override
    public void executarTrabalho() {
        System.out.println("Engenheiro criando projetos");
    }
}

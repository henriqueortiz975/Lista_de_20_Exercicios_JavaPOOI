package exercicio12_sistema_de_profissoes;

public class Advogado extends Profissao {
    private String especialidade;
    private int casosAtivos;

    public Advogado(String nome, String area, double salario,
            String especialidade, int casosAtivos) {
        super(nome, area, salario);
        this.especialidade = especialidade;
        this.casosAtivos = casosAtivos;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCasosAtivos() {
        return casosAtivos;
    }

    public void setCasosAtivos(int casosAtivos) {
        this.casosAtivos = casosAtivos;
    }
    
    @Override
    public void executarTrabalho() {
        System.out.println("Advogado defendendo clientes");
    }
}
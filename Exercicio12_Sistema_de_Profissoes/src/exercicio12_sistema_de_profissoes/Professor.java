package exercicio12_sistema_de_profissoes;

public class Professor extends Profissao {
    private String disciplina;
    private int cargaHoraria;
    private String nivelEnsino;

    public Professor(String nome, String area, double salario,
            String disciplina, int cargaHoraria, String nivelEnsino) {
        super(nome, area, salario);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
        this.nivelEnsino = nivelEnsino;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNivelEnsino() {
        return nivelEnsino;
    }

    public void setNivelEnsino(String nivelEnsino) {
        this.nivelEnsino = nivelEnsino;
    }
    
    @Override
    public void executarTrabalho() {
        System.out.println("Professor esta dando aulas de " + getDisciplina());
    }
}

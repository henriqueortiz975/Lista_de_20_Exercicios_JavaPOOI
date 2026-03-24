package exercicio5_sistema_escolar;

public class Turma {
    private String nomeTurma;
    private Aluno aluno;
    private Professor professor;

    public Turma(String nomeTurma, Aluno aluno, Professor professor) {
        this.nomeTurma = nomeTurma;
        this.aluno = aluno;
        this.professor = professor;
    }

    public void exibirTurma() {
        System.out.println("Turma: " + nomeTurma);
        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Professor: " + professor.getNome());
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
package exercicio5_sistema_escolar;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    private int cargaHoraria;

    public Professor(String nome, int idade, String cpf, String disciplina, double salario, int cargaHoraria) {
        super(nome, idade, cpf);
        this.disciplina = disciplina;
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void trabalhar() {
        System.out.println("Professor dando aula de " + disciplina);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou professor de " + disciplina + " e meu nome é " + getNome());
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}

package exercicio5_sistema_escolar;

public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;
    private String matricula;

    public Aluno(String nome, int idade, String cpf, String matricula, double nota1, double nota2) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou aluno e meu nome é " + getNome());
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

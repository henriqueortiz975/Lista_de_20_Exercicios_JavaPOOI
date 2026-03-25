package exercicio16_sistema_hospitalar;

public class Medico extends Pessoa {
    private String especialidade;
    private double salario;

    public Medico(String nome, int idade, String cpf, String especialidade,  double salario) {
        super(nome, idade, cpf);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public void realizarAtendimento() {
        System.out.println("Médico atendendo paciente");
    }
}

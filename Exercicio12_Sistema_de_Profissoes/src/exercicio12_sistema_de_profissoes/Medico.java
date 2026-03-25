package exercicio12_sistema_de_profissoes;

public class Medico extends Profissao {
    private String especialidade;
    private int crm;
    private boolean plantonista;

    public Medico(String nome, String area, double salario,
            String especialidade, int crm, boolean plantonista) {
        super(nome, area, salario);
        this.especialidade = especialidade;
        this.crm = crm;
        this.plantonista = plantonista;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public boolean isPlantonista() {
        return plantonista;
    }

    public void setPlantonista(boolean plantonista) {
        this.plantonista = plantonista;
    }
    
    @Override
    public void executarTrabalho() {
        System.out.println("Médico atendendo paciente");
    }
}

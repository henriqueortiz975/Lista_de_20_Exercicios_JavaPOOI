package exercicio16_sistema_hospitalar;

public class Paciente extends Pessoa {
    private String prontuario;
    private String doenca;
    private String convenio;

    public Paciente(String nome, int idade, String cpf, String prontuario,
            String doenca, String convenio) {
        super(nome, idade, cpf);
        this.prontuario = prontuario;
        this.doenca = doenca;
        this.convenio = convenio;
    }


    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    
    @Override
    public void realizarAtendimento() {
        System.out.println("Paciente sendo atendido");
    }
}

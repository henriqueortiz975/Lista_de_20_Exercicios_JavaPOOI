package exercicio16_sistema_hospitalar;

public class Consulta {
    private Paciente paciente;
    private Pessoa profissional;
    private String data;
    private String horario;

    public Consulta(Paciente paciente, Pessoa profissional, String data, String horario) {
        this.paciente = paciente;
        this.profissional = profissional;
        this.data = data;
        this.horario = horario;
    }

    public void agendarConsulta() {
        System.out.println("Consulta agendada para " + data + " às " + getHorario());
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Profissional: " + profissional.getNome());
    }

    public void realizarConsulta() {
        System.out.println("Realizando consulta");
        profissional.realizarAtendimento();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Pessoa getProfissional() {
        return profissional;
    }

    public void setProfissional(Pessoa profissional) {
        this.profissional = profissional;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

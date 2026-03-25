package exercicio16_sistema_hospitalar;

import java.util.ArrayList;

public class Exercicio16_Sistema_Hospitalar {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Ana", 30, "111", "P001", "Gripe", "Unimed");
        Medico medico = new Medico("Dr. João", 45, "222", "Clínico Geral", 15000);
        Enfermeiro enfermeiro = new Enfermeiro("Carlos", 35, "333", "Emergência", 12);

        Consulta consulta1 = new Consulta(paciente, medico, "26/03/2026", "10:00");
        Consulta consulta2 = new Consulta(paciente, enfermeiro, "26/03/2026", "14:00");

        consulta1.agendarConsulta();
        consulta1.realizarConsulta();

        System.out.println("");

        consulta2.agendarConsulta();
        consulta2.realizarConsulta();

        System.out.println("");

        ArrayList<Pessoa> profissionais = new ArrayList<>();
        profissionais.add(medico);
        profissionais.add(enfermeiro);

        for (Pessoa p : profissionais) {
            p.realizarAtendimento();
        }
    }
    
}

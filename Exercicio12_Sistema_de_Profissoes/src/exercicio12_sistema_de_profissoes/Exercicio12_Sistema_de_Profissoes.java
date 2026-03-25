package exercicio12_sistema_de_profissoes;

import java.util.ArrayList;

public class Exercicio12_Sistema_de_Profissoes {

    public static void main(String[] args) {
        ArrayList<Profissao> P1 = new ArrayList<>();

        P1.add(new Medico("Dr. João", "Saúde", 15000, "Cardiologia", 12345, true));
        P1.add(new Professor("Ana", "Educação", 4000, "Matemática", 40, "Ensino Médio"));
        P1.add(new Advogado("Carlos", "Direito", 8000, "Civil", 10));
        P1.add(new Engenheiro("Marcos", "Engenharia", 9000, "Civil", "CREA456", 5));

        for (Profissao pdesc : P1) {
            pdesc.exibir();
            pdesc.executarTrabalho();
            System.out.println("");
        }
    }
    
}

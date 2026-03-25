package exercicio19_sistema_de_cursos;

import java.util.ArrayList;

public class Exercicio19_Sistema_de_Cursos {

    public static void main(String[] args) {
        ArrayList<Curso> curso1 = new ArrayList<>();

        curso1.add(new CursoPresencial("Java", 80, 1000, "Sala 1", 30, 200));
        curso1.add(new CursoOnline("Python", 60, 800, "Udemy", 50, 0.1));
        curso1.add(new CursoTecnico("Informática", 1200, 1500, "TI", true, 24));
        curso1.add(new CursoLivre("Excel", 40, 500, "Planilhas", true, 20));

        for (Curso C1 : curso1) {
            C1.exibirInformacoes();
            System.out.println("Mensalidade: R$ " + C1.calcularMensalidade());
            System.out.println("");
        }
    }
    
}

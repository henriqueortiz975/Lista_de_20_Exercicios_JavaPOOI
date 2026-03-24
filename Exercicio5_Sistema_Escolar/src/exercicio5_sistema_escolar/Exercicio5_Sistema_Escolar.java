package exercicio5_sistema_escolar;

public class Exercicio5_Sistema_Escolar {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Henrique", 17, "111", "A01", 8.0, 7.0);
        Professor professor = new Professor("Avila", 40, "222", "Matemática", 3000, 40);
        Coordenador coordenador = new Coordenador("João", 45, "333", "Ensino Médio", 1000, 10);

        Turma turma = new Turma("1º Ano", aluno, professor);

        Pessoa[] pessoas = {aluno, professor, coordenador};

        for (Pessoa p : pessoas) {
            p.apresentar();
            p.trabalhar();
        }

    }
    
}

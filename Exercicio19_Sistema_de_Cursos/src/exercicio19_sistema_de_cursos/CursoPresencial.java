package exercicio19_sistema_de_cursos;

public class CursoPresencial extends Curso {
    private String sala;
    private int numeroAlunos;
    private double taxaInfraestrutura;

    public CursoPresencial(String nome, int cargaHoraria, double valor,
                           String sala, int numeroAlunos, double taxaInfraestrutura) {
        super(nome, cargaHoraria, valor);
        this.sala = sala;
        this.numeroAlunos = numeroAlunos;
        this.taxaInfraestrutura = taxaInfraestrutura;
    }

    public String getSala() {
        return sala;
    }
    
    public void setSala(String sala) { 
        this.sala = sala; 
    }

    public int getNumeroAlunos() { 
        return numeroAlunos; 
    }
    
    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public double getTaxaInfraestrutura() {
        return taxaInfraestrutura; 
    }
    
    public void setTaxaInfraestrutura(double taxaInfraestrutura) {
        this.taxaInfraestrutura = taxaInfraestrutura; 
    }
    
    @Override
    public double calcularMensalidade() {
        return getValor() + getTaxaInfraestrutura();
    }
}

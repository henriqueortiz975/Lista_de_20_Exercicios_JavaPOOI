package exercicio19_sistema_de_cursos;

public class CursoOnline extends Curso {
    private String plataforma;
    private int numeroVideos;
    private double desconto;

    public CursoOnline(String nome, int cargaHoraria, double valor,
                       String plataforma, int numeroVideos, double desconto) {
        super(nome, cargaHoraria, valor);
        this.plataforma = plataforma;
        this.numeroVideos = numeroVideos;
        this.desconto = desconto;
    }

    public String getPlataforma() { 
        return plataforma; 
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma; 
    }

    public int getNumeroVideos() {
        return numeroVideos; 
    }
    
    public void setNumeroVideos(int numeroVideos) {
        this.numeroVideos = numeroVideos; 
    }

    public double getDesconto() {
        return desconto; 
    }
    
    public void setDesconto(double desconto) { 
        this.desconto = desconto; 
    }
    
    @Override
    public double calcularMensalidade() {
        return getValor() - (getValor() * getDesconto());
    }
}

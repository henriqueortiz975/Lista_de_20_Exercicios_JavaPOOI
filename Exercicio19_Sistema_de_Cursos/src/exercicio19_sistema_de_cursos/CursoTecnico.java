package exercicio19_sistema_de_cursos;

public class CursoTecnico extends Curso {
    private String area;
    private boolean possuiEstagio;
    private int duracaoMeses;

    public CursoTecnico(String nome, int cargaHoraria, double valor,
                        String area, boolean possuiEstagio, int duracaoMeses) {
        super(nome, cargaHoraria, valor);
        this.area = area;
        this.possuiEstagio = possuiEstagio;
        this.duracaoMeses = duracaoMeses;
    }

    public String getArea() {
        return area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }

    public boolean isPossuiEstagio() {
        return possuiEstagio; 
    }
    
    public void setPossuiEstagio(boolean possuiEstagio) {
        this.possuiEstagio = possuiEstagio;
    }

    public int getDuracaoMeses() { 
        return duracaoMeses; 
    }
    
    public void setDuracaoMeses(int duracaoMeses) { 
        this.duracaoMeses = duracaoMeses; 
    }
    
    @Override
    public double calcularMensalidade() {
        return getValor() + 200;
    }
}

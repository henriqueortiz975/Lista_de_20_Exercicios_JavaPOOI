package exercicio19_sistema_de_cursos;

public class CursoLivre extends Curso {
    private String tema;
    private boolean certificado;
    private int aulas;

    public CursoLivre(String nome, int cargaHoraria, double valor,
                      String tema, boolean certificado, int aulas) {
        super(nome, cargaHoraria, valor);
        this.tema = tema;
        this.certificado = certificado;
        this.aulas = aulas;
    }

    public String getTema() { 
        return tema; 
    }
    
    public void setTema(String tema) { 
        this.tema = tema; 
    }

    public boolean getCertificado() { 
        return certificado; 
    }
    
    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }

    public int getAulas() {
        return aulas; 
    }
    
    public void setAulas(int aulas) {
        this.aulas = aulas; 
    }
    
    @Override
    public double calcularMensalidade() {
        return getValor() * 0.8;
    }
}

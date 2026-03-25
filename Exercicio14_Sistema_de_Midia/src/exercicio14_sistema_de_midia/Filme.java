package exercicio14_sistema_de_midia;

public class Filme extends Midia {
    private String diretor;
    private String classificacao;
    private String genero;

    public Filme(String titulo, double duracao, String autor,
            String diretor, String classificacao, String genero) {
        super(titulo, duracao, autor);
        this.diretor = diretor;
        this.classificacao = classificacao;
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public void reproduzir() {
        System.out.println("Assistindo filme: " + getTitulo());
    }
}

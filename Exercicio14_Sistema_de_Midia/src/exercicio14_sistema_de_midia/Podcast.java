package exercicio14_sistema_de_midia;

public class Podcast extends Midia {
    private int episodio;
    private String tema;
    private String plataforma;

    public Podcast(String titulo, double duracao, String autor,
            int episodio, String tema, String plataforma) {
        super(titulo, duracao, autor);
        this.episodio = episodio;
        this.tema = tema;
        this.plataforma = plataforma;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo podcast: " + getTitulo());
    }
}

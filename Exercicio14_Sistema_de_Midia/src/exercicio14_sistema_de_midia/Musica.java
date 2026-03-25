package exercicio14_sistema_de_midia;

public class Musica extends Midia {
    private String genero;
    private String album;
    private int ano;

    public Musica(String titulo, double duracao, String autor,
            String genero, String album, int ano) {
        super(titulo, duracao, autor);
        this.genero = genero;
        this.album = album;
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public void reproduzir() {
        System.out.println("Tocando música: " + getTitulo());
    }
}

package exercicio14_sistema_de_midia;

public class Audiolivro extends Midia {
    private String narrador;
    private int capitulos;
    private String genero;

    public Audiolivro(String titulo, double duracao, String autor,
            String narrador, int capitulos, String genero) {
        super(titulo, duracao, autor);
        this.narrador = narrador;
        this.capitulos = capitulos;
        this.genero = genero;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    @Override
    public void reproduzir() {
        System.out.println("Escutando audiolivro: " + getTitulo());
    }
}

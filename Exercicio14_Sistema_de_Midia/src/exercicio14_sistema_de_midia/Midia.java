package exercicio14_sistema_de_midia;

public class Midia {
    private String titulo;
    private double duracao;
    private String autor;

    public Midia(String titulo, double duracao, String autor) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void reproduzir() {
        System.out.println("Reproduzindo mídia");
    }

    public void exibir() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " minutos");
        System.out.println("Autor: " + getAutor());
    }
}

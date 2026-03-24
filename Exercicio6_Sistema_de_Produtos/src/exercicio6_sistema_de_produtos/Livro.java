package exercicio6_sistema_de_produtos;

public class Livro extends Produto {
    private String autor;
    private int paginas;
    private String genero;

    public Livro(String nome, double preco, int quantidade, String autor,
            int paginas, String genero) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

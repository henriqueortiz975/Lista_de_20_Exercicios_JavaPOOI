package exercicio17_sistema_de_biblioteca;

public class Livro extends ItemBiblioteca {
    private String autor;
    private int paginas;
    private int diasEmprestimo;

    public Livro(String titulo, String codigo, boolean disponivel, String autor, int paginas, int diasEmprestimo) {
        super(titulo, codigo, disponivel);
        this.autor = autor;
        this.paginas = paginas;
        this.diasEmprestimo = diasEmprestimo;
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

    public int getDiasEmprestimo() { 
        return diasEmprestimo; 
    }
    
    public void setDiasEmprestimo(int diasEmprestimo) { 
        this.diasEmprestimo = diasEmprestimo; 
    }
    
    @Override
    public void emprestar() {
        if (getDisponivel()) {
            setDisponivel(false);
            System.out.println("Livro emprestado por " + getDiasEmprestimo() + " dias");
        } else {
            System.out.println("Livro indisponível");
        }
    }
}

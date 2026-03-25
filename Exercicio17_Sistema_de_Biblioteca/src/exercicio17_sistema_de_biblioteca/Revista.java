package exercicio17_sistema_de_biblioteca;

public class Revista extends ItemBiblioteca {
    private int edicao;
    private String categoria;
    private int diasEmprestimo;

    public Revista(String titulo, String codigo, boolean disponivel,
                   int edicao, String categoria, int diasEmprestimo) {
        super(titulo, codigo, disponivel);
        this.edicao = edicao;
        this.categoria = categoria;
        this.diasEmprestimo = diasEmprestimo;
    }

    @Override
    public void emprestar() {
        if (getDisponivel()) {
            setDisponivel(false);
            System.out.println("Revista emprestada por " + getDiasEmprestimo() + " dias");
        } else {
            System.out.println("Revista indisponível");
        }
    }

    public int getEdicao() { 
        return edicao; 
    }
    
    public void setEdicao(int edicao) {
        this.edicao = edicao; 
    }

    public String getCategoria() {
        return categoria; 
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria; 
    }

    public int getDiasEmprestimo() {
        return diasEmprestimo; 
    }
    
    public void setDiasEmprestimo(int diasEmprestimo) {
        this.diasEmprestimo = diasEmprestimo; 
    }
}

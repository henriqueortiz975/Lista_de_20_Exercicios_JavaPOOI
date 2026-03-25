package exercicio17_sistema_de_biblioteca;

public class ItemBiblioteca {
    private String titulo;
    private String codigo;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, String codigo, boolean disponivel) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.disponivel = disponivel;
    }

    public void emprestar() {
        System.out.println("Emprestando item");
    }

    public void devolver() {
        System.out.println("Devolvendo item");
        disponivel = true;
    }

    public void exibir() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Código: " + getCodigo());
        System.out.println("Disponível: " + getDisponivel());
    }

    public String getTitulo() {
        return titulo; 
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo; 
    }

    public String getCodigo() { 
        return codigo; 
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo; 
    }

    public boolean getDisponivel() { 
        return disponivel; 
    }
    
    public void setDisponivel(boolean disponivel) { 
        this.disponivel = disponivel; 
    }
}

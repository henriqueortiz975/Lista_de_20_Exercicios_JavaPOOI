package exercicio17_sistema_de_biblioteca;

public class Jornal extends ItemBiblioteca {
    private String dataPublicacao;
    private String cidade;
    private boolean somenteLocal;

    public Jornal(String titulo, String codigo, boolean disponivel,
                  String dataPublicacao, String cidade, boolean somenteLocal) {
        super(titulo, codigo, disponivel);
        this.dataPublicacao = dataPublicacao;
        this.cidade = cidade;
        this.somenteLocal = somenteLocal;
    }

    public String getDataPublicacao() { 
        return dataPublicacao; 
    }
    
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao; 
    }

    public String getCidade() { 
        return cidade; 
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade; 
    }

    public boolean isSomenteLocal() {
        return somenteLocal;
    }
    
    public void setSomenteLocal(boolean somenteLocal) { 
        this.somenteLocal = somenteLocal;
    }
    
    @Override
    public void emprestar() {
        if (somenteLocal) {
            System.out.println("Jornal apenas para leitura local");
        } else if (getDisponivel()) {
            setDisponivel(false);
            System.out.println("Jornal emprestado");
        } else {
            System.out.println("Jornal indisponível");
        }
    }
}
package exercicio7_sistema_de_formas_geometricas;

public class Forma {
    private String nome;
    private String cor;
    private boolean preenchido;

    public Forma(String nome, String cor, boolean preenchido) {
        this.nome = nome;
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public double calcularArea() {
        return 0;
    }

    public void exibir() {
        System.out.println("Forma: " + nome + " , Área: " + calcularArea());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }
}

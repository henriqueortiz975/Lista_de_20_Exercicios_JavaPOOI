package exercicio12_sistema_de_profissoes;

public class Profissao {
    private String nome;
    private String area;
    private double salario;

    public Profissao(String nome, String area, double salario) {
        this.nome = nome;
        this.area = area;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void executarTrabalho() {
        System.out.println("Trabalhando");
    }

    public void exibir() {
        System.out.println("Profissão: " + getNome());
        System.out.println("Área: " + getArea());
        System.out.println("Salário: R$ " + getSalario());
    }
}

package exercicio7_sistema_de_formas_geometricas;

public class Quadrado extends Forma {
    private double lado;
    private double perimetro;
    private String unidade;

    public Quadrado(String nome, String cor, boolean preenchido, double lado, String unidade) {
        super(nome, cor, preenchido);
        this.lado = lado;
        this.unidade = unidade;
        this.perimetro = lado * 4;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}

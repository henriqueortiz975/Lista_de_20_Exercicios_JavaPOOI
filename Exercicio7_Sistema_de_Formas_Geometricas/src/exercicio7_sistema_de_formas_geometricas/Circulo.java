package exercicio7_sistema_de_formas_geometricas;

public class Circulo extends Forma {
    private double raio;
    private double diametro;
    private final double PI = 3.14;

    public Circulo(String nome, String cor, boolean preenchido, double raio) {
        super(nome, cor, preenchido);
        this.raio = raio;
        this.diametro = raio * 2;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}

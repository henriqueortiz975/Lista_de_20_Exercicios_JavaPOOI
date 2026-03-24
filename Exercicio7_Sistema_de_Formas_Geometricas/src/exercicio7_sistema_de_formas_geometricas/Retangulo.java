package exercicio7_sistema_de_formas_geometricas;

public class Retangulo extends Forma {
    private double largura;
    private double altura;
    private double perimetro;

    public Retangulo(String nome, String cor, boolean preenchido, double largura, double altura) {
        super(nome, cor, preenchido);
        this.largura = largura;
        this.altura = altura;
        this.perimetro = 2 * (largura + altura);
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}

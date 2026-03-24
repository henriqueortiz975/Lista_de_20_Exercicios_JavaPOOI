package exercicio7_sistema_de_formas_geometricas;

public class Triangulo extends Forma {
    private double base;
    private double altura;
    private String tipo;

    public Triangulo(String nome, String cor, boolean preenchido, double base, double altura, String tipo) {
        super(nome, cor, preenchido);
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

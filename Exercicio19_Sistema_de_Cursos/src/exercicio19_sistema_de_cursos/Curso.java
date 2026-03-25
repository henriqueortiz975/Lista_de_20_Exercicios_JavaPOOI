package exercicio19_sistema_de_cursos;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private double valor;

    public Curso(String nome, int cargaHoraria, double valor) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;
    }

    public String getNome() { 
        return nome; 
    }
    
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor; 
    }
    
    public void exibirInformacoes() {
        System.out.println("Curso: " + getNome());
        System.out.println("Carga Horária: " + getCargaHoraria() + " horas");
        System.out.println("Valor: R$ " + getValor());
    }

    public double calcularMensalidade() {
        return valor;
    }
}

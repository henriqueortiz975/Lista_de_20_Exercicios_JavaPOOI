package exercicio3_funcionarios_de_empresa;

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void trabalhar() {
        System.out.println("O funcionário está trabalhando");
    }

    public double calcularBonus() {
        return salario * 0.10;
    }
}

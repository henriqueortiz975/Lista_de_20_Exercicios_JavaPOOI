package exercicio3_funcionarios_de_empresa;

class Vendedor extends Funcionario {

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("O vendedor está atendendo clientes.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }
}

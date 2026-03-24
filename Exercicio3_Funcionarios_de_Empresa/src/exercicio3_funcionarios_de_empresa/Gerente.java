package exercicio3_funcionarios_de_empresa;

class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("O gerente está gerenciando a equipe.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.20;
    }
}

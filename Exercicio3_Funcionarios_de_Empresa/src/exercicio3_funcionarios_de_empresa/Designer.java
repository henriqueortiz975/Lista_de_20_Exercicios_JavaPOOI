package exercicio3_funcionarios_de_empresa;

class Designer extends Funcionario {

    public Designer(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("O designer está criando layouts.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.12;
    }
}

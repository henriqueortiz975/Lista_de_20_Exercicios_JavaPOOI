package exercicio3_funcionarios_de_empresa;

class Programador extends Funcionario {

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println("O programador está escrevendo código.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.18;
    }
}

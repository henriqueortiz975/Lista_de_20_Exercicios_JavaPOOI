package exercicio3_funcionarios_de_empresa;

public class Exercicio3_Funcionarios_de_Empresa {

    public static void main(String[] args) {
        Funcionario f1 = new Gerente("Ana", 8000);
        Funcionario f2 = new Vendedor("Carlos", 3000);
        Funcionario f3 = new Programador("Lucas", 6000);
        Funcionario f4 = new Designer("Marina", 4000);

        Funcionario[] funcionarios = {f1, f2, f3, f4};

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
            funcionario.trabalhar();
            System.out.println("Bônus: R$ " + funcionario.calcularBonus());
            System.out.println();
        }
    }
}

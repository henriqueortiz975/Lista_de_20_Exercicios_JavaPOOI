package exercicio4._sistema_bancario;

public class Exercicio4_Sistema_Bancario {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Henrique", "54675434", "Rua rio branco");

        ContaBancaria conta1 = new ContaCorrente(1, 1000, cliente, 500, 2);
        ContaBancaria conta2 = new ContaPoupanca(2, 2000, cliente, 0.05, 10);
        ContaBancaria conta3 = new ContaSalario(3, 1500, cliente, "Empresa", 2);

        ContaBancaria[] contas = {conta1, conta2, conta3};

        for (ContaBancaria conta : contas) {
            conta.depositar(200);
            conta.sacar(100);
            conta.consultarSaldo();
            System.out.println("");
        }
    }
    
}

package exercicio4._sistema_bancario;

public class ContaCorrente extends ContaBancaria {
    private double limite;
    private double taxa;

    public ContaCorrente(int numero, double saldo, Cliente titular, double limite, double taxa) {
        super(numero, saldo, titular);
        this.limite = limite;
        this.taxa = taxa;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = getSaldo() + limite;

        if (valor <= saldoDisponivel) {
            setSaldo(getSaldo() - valor - taxa);
        } else {
            System.out.println("Limite excedido!");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}

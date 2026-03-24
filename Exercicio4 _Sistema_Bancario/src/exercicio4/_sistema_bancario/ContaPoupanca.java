package exercicio4._sistema_bancario;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;
    private int aniversario;

    public ContaPoupanca(int numero, double saldo, Cliente titular, double taxaRendimento, int aniversario) {
        super(numero, saldo, titular);
        this.taxaRendimento = taxaRendimento;
        this.aniversario = aniversario;
    }

    public void render() {
        setSaldo(getSaldo() + (getSaldo() * taxaRendimento));
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        System.out.println("Saque realizado na poupança");
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }
}
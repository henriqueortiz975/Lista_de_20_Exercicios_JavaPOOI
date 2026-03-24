package exercicio4._sistema_bancario;

public class ContaBancaria {
    private int numero;
    private double saldo;
    private Cliente titular;

    public ContaBancaria(int numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: R$ " + saldo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
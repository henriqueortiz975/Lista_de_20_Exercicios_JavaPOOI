package exercicio8_sistema_de_pagamentos;

public class Dinheiro extends Pagamento {
    private double valorRecebido;
    private double troco;
    private String moeda;

    public Dinheiro(double valor, String data, String descricao, double valorRecebido, String moeda) {
        super(valor, data, descricao);
        this.valorRecebido = valorRecebido;
        this.moeda = moeda;
        this.troco = valorRecebido - valor;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento em dinheiro");
        System.out.println("Recebido: R$ " + getValorRecebido());
        System.out.println("Troco: R$ " + getTroco());
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }
}

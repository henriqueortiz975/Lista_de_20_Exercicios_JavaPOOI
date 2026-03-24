package exercicio8_sistema_de_pagamentos;

public class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private String bandeira;
    private int parcelas;

    public CartaoCredito(double valor, String data, String descricao, String numeroCartao, String bandeira, int parcelas) {
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
        this.bandeira = bandeira;
        this.parcelas = parcelas;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento no cartão de crédito");
        System.out.println("Bandeira: " + getBandeira());
        System.out.println("Parcelas: " + getParcelas());
        System.out.println("Valor: R$ " + getValor());
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}

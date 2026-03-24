package exercicio8_sistema_de_pagamentos;

public class Pix extends Pagamento {
    private String chavePix;
    private String tipoChave;
    private String banco;

    public Pix(double valor, String data, String descricao, String chavePix, String tipoChave, String banco) {
        super(valor, data, descricao);
        this.chavePix = chavePix;
        this.tipoChave = tipoChave;
        this.banco = banco;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX");
        System.out.println("Chave: " + getChavePix());
        System.out.println("Banco: " + getBanco());
        System.out.println("Valor: R$ " + getValor());
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getTipoChave() {
        return tipoChave;
    }

    public void setTipoChave(String tipoChave) {
        this.tipoChave = tipoChave;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}

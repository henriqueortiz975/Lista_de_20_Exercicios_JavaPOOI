package exercicio8_sistema_de_pagamentos;

public class Boleto extends Pagamento {
    private String codigoBarras;
    private String dataVencimento;
    private boolean pago;

    public Boleto(double valor, String data, String descricao, String codigoBarras, String dataVencimento, boolean pago) {
        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
        this.dataVencimento = dataVencimento;
        this.pago = pago;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via boleto");
        System.out.println("Código: " + getCodigoBarras());
        System.out.println("Vencimento: " + getDataVencimento());
        System.out.println("Valor: R$ " + getValor());
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}

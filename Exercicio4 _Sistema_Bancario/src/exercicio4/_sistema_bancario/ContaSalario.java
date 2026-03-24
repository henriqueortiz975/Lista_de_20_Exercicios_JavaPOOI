package exercicio4._sistema_bancario;

public class ContaSalario extends ContaBancaria {
    private String empresa;
    private int saquesGratis;

    public ContaSalario(int numero, double saldo, Cliente titular, String empresa, int saquesGratis) {
        super(numero, saldo, titular);
        this.empresa = empresa;
        this.saquesGratis = saquesGratis;
    }

    @Override
    public void sacar(double valor) {
        if (saquesGratis > 0) {
            saquesGratis--;
            super.sacar(valor);
        } else {
            double taxa = 5.0;
            super.sacar(valor + taxa);
            System.out.println("Taxa de saque aplicada!");
        }
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getSaquesGratis() {
        return saquesGratis;
    }

    public void setSaquesGratis(int saquesGratis) {
        this.saquesGratis = saquesGratis;
    }
}
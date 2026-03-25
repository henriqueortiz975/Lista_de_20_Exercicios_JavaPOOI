package exercicio13_sistema_de_notificacoes;

public class SMS extends Notificacao {
    private String numero;
    private String operadora;
    private boolean internacional;

    public SMS(String destinatario, String mensagem, String data,
            String numero, String operadora, boolean internacional) {
        super(destinatario, mensagem, data);
        this.numero = numero;
        this.operadora = operadora;
        this.internacional = internacional;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public boolean isInternacional() {
        return internacional;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }
    
    @Override
    public void enviar() {
        System.out.println("Enviando SMS");
        System.out.println("Número: " + getNumero());
        System.out.println("Mensagem: " + getMensagem());
    }
}

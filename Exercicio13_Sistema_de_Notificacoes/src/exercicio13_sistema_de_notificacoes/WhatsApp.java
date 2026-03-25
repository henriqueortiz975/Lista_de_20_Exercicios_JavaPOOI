package exercicio13_sistema_de_notificacoes;

public class WhatsApp extends Notificacao {
    private String numero;
    private boolean mensagemVoz;
    private boolean statusOnline;

    public WhatsApp(String destinatario, String mensagem, String data,
            String numero, boolean mensagemVoz, boolean statusOnline) {
        super(destinatario, mensagem, data);
        this.numero = numero;
        this.mensagemVoz = mensagemVoz;
        this.statusOnline = statusOnline;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isMensagemVoz() {
        return mensagemVoz;
    }

    public void setMensagemVoz(boolean mensagemVoz) {
        this.mensagemVoz = mensagemVoz;
    }

    public boolean isStatusOnline() {
        return statusOnline;
    }

    public void setStatusOnline(boolean statusOnline) {
        this.statusOnline = statusOnline;
    }
    
    @Override
    public void enviar() {
        System.out.println("Enviando mensagem no WhatsApp");
        System.out.println("Número: " + getNumero());
        System.out.println("Mensagem: " + getMensagem());
    }
}

package exercicio13_sistema_de_notificacoes;

public class Email extends Notificacao {
    private String assunto;
    private String remetente;
    private boolean comAnexo;

    public Email(String destinatario, String mensagem, String data,
            String assunto, String remetente, boolean comAnexo) {
        super(destinatario, mensagem, data);
        this.assunto = assunto;
        this.remetente = remetente;
        this.comAnexo = comAnexo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public boolean isComAnexo() {
        return comAnexo;
    }

    public void setComAnexo(boolean comAnexo) {
        this.comAnexo = comAnexo;
    }
    
    @Override
    public void enviar() {
        System.out.println("Enviando Email");
        System.out.println("Assunto: " + getAssunto());
        System.out.println("Para: " + getDestinatario());
        System.out.println("Mensagem: " + getMensagem());
    }
}

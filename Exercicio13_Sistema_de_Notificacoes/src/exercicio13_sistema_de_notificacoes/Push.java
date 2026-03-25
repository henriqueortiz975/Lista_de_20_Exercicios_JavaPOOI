package exercicio13_sistema_de_notificacoes;

public class Push extends Notificacao {
    private String aplicativo;
    private boolean urgente;
    private int prioridade;

    public Push(String destinatario, String mensagem, String data,
            String aplicativo, boolean urgente, int prioridade) {
        super(destinatario, mensagem, data);
        this.aplicativo = aplicativo;
        this.urgente = urgente;
        this.prioridade = prioridade;
    }

    public String getAplicativo() {
        return aplicativo;
    }

    public void setAplicativo(String aplicativo) {
        this.aplicativo = aplicativo;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    @Override
    public void enviar() {
        System.out.println("Enviando notificação Push");
        System.out.println("App: " + getAplicativo());
        System.out.println("Mensagem: " + getMensagem());
    }
}

package exercicio13_sistema_de_notificacoes;

import java.util.ArrayList;

public class Exercicio13_Sistema_de_Notificacoes {

    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email("artgur@email.com", "Olá!", "25/03/2026", "Saudação", "Sla@email.com", true));
        notificacoes.add(new SMS("pirrer", "Mensagem SMS", "25/03/2026", "97698-65875", "Vivo", false));
        notificacoes.add(new WhatsApp("Carlinhos", "Mensagem WhatsApp", "25/03/20263", "3535-1243", false, true));
        notificacoes.add(new Push("Henrique", "Notificação Push", "25/03/2026", "App X", true, 1));

        for (Notificacao n : notificacoes) {
            n.exibir();
            n.enviar();
            System.out.println("");
        }
    }
    
}

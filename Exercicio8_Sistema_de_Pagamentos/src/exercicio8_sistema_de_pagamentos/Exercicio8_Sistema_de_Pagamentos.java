package exercicio8_sistema_de_pagamentos;

import java.util.ArrayList;

public class Exercicio8_Sistema_de_Pagamentos {

    public static void main(String[] args) {
        ArrayList<Pagamento> pagamentos = new ArrayList<>();

        pagamentos.add(new CartaoCredito(500, "24/03/2026", "Compra online", "3533-2342", "Visa", 3));
        pagamentos.add(new Pix(200, "22/01/2026", "Transferência", "Nome@email.com", "Email", "Nubank"));
        pagamentos.add(new Boleto(300, "10/02/2025", "Conta de luz", "254834574", "30/03/2026", false));
        pagamentos.add(new Dinheiro(100, "24/03/2026", "Compra local", 150, "Real"));

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
            System.out.println("");
        }
    }
    
}

package exercicio15_sistema_de_restaurante;

import java.util.ArrayList;

public class Exercicio15_Sistema_de_Restaurante {

    public static void main(String[] args) {
        ArrayList<ItemCardapio> itens = new ArrayList<>();

        itens.add(new Pizza("Calabresa", 50, "Pizza tradicional", "Grande", 2, 5));
        itens.add(new Hamburguer("X-Burger", 25, "Hambúrguer simples", true, 2, 3));
        itens.add(new Bebida("Refrigerante", 8, "Lata 350ml", "Médio", true, 1));
        itens.add(new Sobremesa("Sorvete", 15, "Sorvete de chocolate", "Gelado", 0.1));

        for (ItemCardapio item : itens) {
            item.exibir();
            item.preparar();
            System.out.println("----------------------");
        }
    }
    
}

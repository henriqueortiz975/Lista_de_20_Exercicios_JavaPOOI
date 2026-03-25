package exercicio18_sistema_de_imoveis;

import java.util.ArrayList;

public class Exercicio18_Sistema_de_Imoveis {

    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<>();

        imoveis.add(new Casa("Rua rio branco", 300000, 120, 3, true, 50));
        imoveis.add(new Apartamento("Av aznenado", 250000, 80, 5, 500, true));
        imoveis.add(new Terreno("Rua vermelhoin", 150000, 200, "Argiloso", true, false));
        imoveis.add(new SalaComercial("Centro", 400000, 100, "Loja", true, 800));

        for (Imovel i : imoveis) {
            i.exibir();
            System.out.println("");
        }
    }
    
}

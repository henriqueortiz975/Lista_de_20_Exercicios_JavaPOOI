package exercicio17_sistema_de_biblioteca;

import java.util.ArrayList;

public class Exercicio17_Sistema_de_Biblioteca {

    public static void main(String[] args) {
        ArrayList<ItemBiblioteca> itens = new ArrayList<>();

        itens.add(new Livro("Java Básico", "L01", true, "Autor X", 200, 7));
        itens.add(new Revista("Tech News", "R01", true, 12, "Tecnologia", 3));
        itens.add(new Jornal("Jornal Diário", "J01", true, "25/03/2026", "SP", true));
        itens.add(new DVD("Filme Ação", "D01", true, "Ação", 120, 2.5));

        for (ItemBiblioteca item : itens) {
            item.exibir();
            item.emprestar(); 
            item.devolver();
            System.out.println("");
        }
    }
    
}

package exercicio14_sistema_de_midia;

import java.util.ArrayList;

public class Exercicio14_Sistema_de_Midia {

    public static void main(String[] args) {
        ArrayList<Midia> midias = new ArrayList<>();

        midias.add(new Musica("Música feliz", 3.5, "Maria", "Pop", "Álbum FelizidadeHope", 2022));
        midias.add(new Filme("Corra!", 120, "Luis", "Carlos", "14+", "Ação"));
        midias.add(new Podcast("Podpah", 45, "casemiro", 10, "Tecnologia", "Spotify"));
        midias.add(new Audiolivro("Livro Áudio", 150, "Henrique", "João", 20, "Ficção"));

        for (Midia m : midias) {
            m.exibir();
            m.reproduzir();
            System.out.println("");
        }
    }
    
}

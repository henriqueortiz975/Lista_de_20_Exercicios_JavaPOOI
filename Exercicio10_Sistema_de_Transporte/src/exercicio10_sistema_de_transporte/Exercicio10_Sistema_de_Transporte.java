package exercicio10_sistema_de_transporte;

import java.util.ArrayList;

public class Exercicio10_Sistema_de_Transporte {

    public static void main(String[] args) {
        ArrayList<Transporte> T1 = new ArrayList<>();

        T1.add(new Taxi(4, "Taxi", 5, 10, 2.5, "Bandeira 1"));
        T1.add(new Uber(4, "Uber", 4, 8, 1.5, "UberX"));
        T1.add(new Onibus(40, "OnibusEx", 4.5, 5, 0.5, "Linha 154"));
        T1.add(new Metro(200, "MetroEx", 3, 6, 0.3, "Linha Azul"));

        for (Transporte t : T1) {
            t.exibir();
            System.out.println("");
        }
    }
}

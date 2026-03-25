package exercicio11_sistema_de_dispositivos_eletronicos;

import java.util.ArrayList;

public class Exercicio11_Sistema_de_Dispositivos_Eletronicos {

    public static void main(String[] args) {

        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        dispositivos.add(new Computador("Dell", "Inspiron", true, 16, "i7", 512));
        dispositivos.add(new Smartphone("Samsung", "Galaxy S23", false, "Android", 256, true));
        dispositivos.add(new Tablet("Apple", "iPad", true, 10.5, true, 8000));
        dispositivos.add(new Televisao("LG", "OLED", false, 55, "4K", true));

        for (Dispositivo d : dispositivos) {
            d.ligar();
            d.executarFuncao();
            System.out.println("");
        }
    }
}

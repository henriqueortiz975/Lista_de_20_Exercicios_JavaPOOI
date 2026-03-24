package exercicio7_sistema_de_formas_geometricas;

import java.util.ArrayList;

public class Exercicio7_Sistema_de_Formas_Geometricas {

    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Quadrado("Quadrado", "Azul", true, 4, "cm"));
        formas.add(new Retangulo("Retângulo", "Vermelho", false, 5, 3));
        formas.add(new Circulo("Círculo", "Verde", true, 2.5));
        formas.add(new Triangulo("Triângulo", "Amarelo", true, 6, 4, "Retângulo"));

        for (Forma f : formas) {
            f.exibir();
            System.out.println("");
        }
    }
    
}

package exercicio1_.sistema_de_animais;

public class Exercicio1_Sistema_de_Animais {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5, 9.50, "Pitbull");
        Animal gato = new Gato("Luna", 1, 5.0, "Cinza");
        Animal vaca = new Vaca("Vaquinha", 6, 350.0, 25);
        Animal cavalo = new Cavalo("Pé de Pano", 4, 400.0, 71);

        Animal[] animais = {cachorro, gato, vaca, cavalo};

        for (Animal animal : animais) {
            animal.emitirSom();
            System.out.println("");
        }
    }
}

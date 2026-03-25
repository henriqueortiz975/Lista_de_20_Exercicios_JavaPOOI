package exercicio20_sistema_de_zoologico;

public class Exercicio20_Sistema_de_Zoologico {

    public static void main(String[] args) {
        Animal[] animais = new Animal[4];

        animais[0] = new Leao("Rex", 5, 190, "Savana", true, 1);
        animais[1] = new Macaco("Macaquinho", 3, 35, "Capuchinho", true, 8);
        animais[2] = new Elefante("Dumbo", 10, 5000, 2.0, true, 100);
        animais[3] = new Papagaio("Loro jose", 2, 1.5, "Verde", true, 50);

        for (Animal a : animais) {
            a.exibir();
            a.emitirSom();      
            a.alimentar();      
            a.movimentar();    
            System.out.println("");
        }
    }
    
}

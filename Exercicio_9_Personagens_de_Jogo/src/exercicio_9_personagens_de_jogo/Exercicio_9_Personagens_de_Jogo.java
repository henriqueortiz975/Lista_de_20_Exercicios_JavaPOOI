package exercicio_9_personagens_de_jogo;

public class Exercicio_9_Personagens_de_Jogo {

    public static void main(String[] args) {
        Personagem P1 = new Guerreiro("Henrique", 135.50, 18, 20);
        Personagem P2 = new Mago("Rafael", 70, 18, 15);
        Personagem P3 = new Arqueiro("Artur", 80, 16, 15);
        Personagem P4 = new Paladino("Veeck", 125, 18, 18);
        
        Personagem[] personagens = {P1, P2, P3, P4};
        
        for(Personagem P : personagens) {
            P.atacar();
            P.defender();
            System.out.println("");
        }

    }
    
}

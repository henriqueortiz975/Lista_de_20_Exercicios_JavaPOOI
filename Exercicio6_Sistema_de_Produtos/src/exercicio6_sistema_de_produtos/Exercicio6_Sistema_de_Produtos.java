package exercicio6_sistema_de_produtos;

public class Exercicio6_Sistema_de_Produtos {

    public static void main(String[] args) {
        Produto p1 = new Livro("Romance", 100, 10, "Autor X", 200, "relação romantica");
        Produto p2 = new Eletronico("Celular", 2000, 5, "Samsung", 12, 0.2);
        Produto p3 = new Roupa("Camisa", 50, 20, "M", "Preta", 0.15);
        Produto p4 = new Alimento("Leite", 10, 30, "30/03/2026", true, 0.1);

        Produto[] produtos = {p1, p2, p3, p4};

        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome());
            System.out.println("Preço final: R$ " + p.calcularPrecoFinal());
            System.out.println("");
        }

    }
    
}

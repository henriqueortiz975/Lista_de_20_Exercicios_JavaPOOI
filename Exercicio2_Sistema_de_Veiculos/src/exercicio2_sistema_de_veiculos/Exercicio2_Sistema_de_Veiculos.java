package exercicio2_sistema_de_veiculos;

public class Exercicio2_Sistema_de_Veiculos {

    public static void main(String[] args) {
        Veiculo v1 = new Carro("Toyota", "Corolla", 2022, 70);
        Veiculo v2 = new Moto("Honda", "CB500", 2021, 100);
        Veiculo v3 = new Bicicleta("Caloi", "Elite", 2020, 30.50);
        Veiculo v4 = new Onibus("Mercedes", "Urbano", 2019, 60);

        Veiculo[] veiculos = {v1, v2, v3, v4};

        for (Veiculo v : veiculos) {
            v.mover();
        }

    }
    
}

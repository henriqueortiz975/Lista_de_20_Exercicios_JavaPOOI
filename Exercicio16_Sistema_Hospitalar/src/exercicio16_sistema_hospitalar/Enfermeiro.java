package exercicio16_sistema_hospitalar;

public class Enfermeiro extends Pessoa {
    private String setor;
    private int plantaoHoras;

    public Enfermeiro(String nome, int idade, String cpf, String setor, int plantaoHoras) {
        super(nome, idade, cpf);
        this.setor = setor;
        this.plantaoHoras = plantaoHoras;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getPlantaoHoras() {
        return plantaoHoras;
    }

    public void setPlantaoHoras(int plantaoHoras) {
        this.plantaoHoras = plantaoHoras;
    }
    
    @Override
    public void realizarAtendimento() {
        System.out.println("Enfermeiro auxiliando no atendimento");
    }
}

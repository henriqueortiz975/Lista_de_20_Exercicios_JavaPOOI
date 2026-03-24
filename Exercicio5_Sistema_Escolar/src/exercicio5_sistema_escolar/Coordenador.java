package exercicio5_sistema_escolar;

public class Coordenador extends Pessoa {
    private String setor;
    private double bonus;
    private int anosExperiencia;

    public Coordenador(String nome, int idade, String cpf, String setor, double bonus, int anosExperiencia) {
        super(nome, idade, cpf);
        this.setor = setor;
        this.bonus = bonus;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void trabalhar() {
        System.out.println("Coordenador gerenciando o setor de " + setor);
    }

    @Override
    public void apresentar() {
        System.out.println("Sou coordenador do setor " + setor + " e meu nome é " + getNome());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
}

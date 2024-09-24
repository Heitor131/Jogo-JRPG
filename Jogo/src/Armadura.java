public class Armadura {

    Jogador jogador;
    private String nome;
    private int ConstDefesa;
    private int redAgilidade;

    public double getDefesa() {
        return ConstDefesa;
    }

    public void setDefesa(int defesa) {
        this.ConstDefesa = this.ConstDefesa + (int)(1.5 * Integer.parseInt(jogador.getNomesAtributos()[1]));
    }

    private double defesa;

    public Armadura(int constDefesa, String nome, int redAgilidade){
        this.ConstDefesa = constDefesa;
        this.nome = nome;
        this.redAgilidade = redAgilidade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConstDefesa() {
        return ConstDefesa;
    }

    public void setConstDefesa(int constDefesa) {
        ConstDefesa = constDefesa;
    }

    public int getRedAgilidade() {
        return redAgilidade;
    }

    public void setRedAgilidade(int redAgilidade) {
        this.redAgilidade = redAgilidade;
    }

    
}
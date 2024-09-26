package ArmaArmadura;
//oi 
import Personagens.Jogador;



public class Armadura {
    Jogador jogador;
    private String nome;
    private int constDefesa;
    private int redAgilidade;

    public Armadura(int constDefesa, String nome, int redAgilidade) {
        this.constDefesa = constDefesa;
        this.nome = nome;
        this.redAgilidade = redAgilidade;
    }

    public void calacularDefesa() {
        setDefesa();
    }

    
    public double getDefesa() {
        return constDefesa;
    }

    public void setDefesa() {
        this.constDefesa += (int) (1.5 * Integer.parseInt(jogador.getNomesAtributos()[1]));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConstDefesa() {
        return constDefesa;
    }

    public void setConstDefesa(int constDefesa) {
        this.constDefesa = constDefesa;
    }

    public int getRedAgilidade() {
        return redAgilidade;
    }

    public void setRedAgilidade(int redAgilidade) {
        this.redAgilidade = redAgilidade;
    }
}

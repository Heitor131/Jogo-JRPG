import java.util.Random;

public class Adversario {
    private String nome;
    private int pv;
    private int dano;
    private int defesa;
    private int agilidade;

    public Adversario(String nome, int pv, int dano, int defesa, int agilidade) {
        this.nome = nome;
        this.pv = pv;
        this.dano = dano;
        this.defesa = defesa;
        this.agilidade = agilidade;
    }

    public int atacar() {
        return Math.max(0, dano - defesa);
    }

    public void receberDano(int dano) {
        this.pv -= dano;
    }

    public boolean estaVivo() {
        return pv > 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPv() {
        return pv;
    }

    public void setPv(int pv) {
        this.pv = pv;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    
    // Getters e Setters...
}

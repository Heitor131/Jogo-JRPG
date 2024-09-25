package Personagens;

import ArmaArmadura.Arma;

public class Jogador {
    private String nome;
    private float pontosVida;
    private int[] atributos;
    private String[] nomesAtributos;
    private String[] nomesArmas;
    private String[] nomesArmaduras;
    private int valorTotal;

    public Jogador() {
        this.pontosVida = 0;
        this.valorTotal = 15;
        this.atributos = new int[4];
        this.nomesAtributos = new String[] { "Força", "Constituição", "Agilidade", "Destreza" };
        this.nomesArmas = new String[] { "Revolver", "Escopeta", "Rifle" };
        this.nomesArmaduras = new String[] { "Armadura de Ferro", "Armadura de ouro" };
    }

    public int atacar() {
        // Chama o método estático da classe Arma, passando a arma e o valor de força
        return Math.max(0, Arma.calcularDanoArma(nomesArmas[0], atributos[0], valorTotal));
    }

    public void receberDano(int dano) {
        this.pontosVida -= dano;
    }

    public boolean estaVivo() {
        return pontosVida > 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
        }
    }

    public float getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(float pontosVida) {
        if (pontosVida > 0) {
            this.pontosVida = pontosVida;
        }
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int[] getAtributos() {
        return atributos;
    }

    public void setAtributos(int[] atributos) {
        this.atributos = atributos;
    }

    public String[] getNomesAtributos() {
        return nomesAtributos;
    }

    public void setNomesAtributos(String[] nomesAtributos) {
        this.nomesAtributos = nomesAtributos;
    }

    public String[] getNomesArmas() {
        return nomesArmas;
    }

    public void setNomesArmas(String[] nomesArmas) {
        this.nomesArmas = nomesArmas;
    }

    public String[] getNomesArmaduras() {
        return nomesArmaduras;
    }

    public void setNomesArmaduras(String[] nomesArmaduras) {
        this.nomesArmaduras = nomesArmaduras;
    }
}

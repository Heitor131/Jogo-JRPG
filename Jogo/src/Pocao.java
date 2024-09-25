import Personagens.*;

public class Pocao {
    private  double valorpocao = 5;
    public  int quantidadePorcao = 9;


    public void pocao(Jogador jogador)
    {
        if(jogador.getPontosVida() < 100)
        {
            System.out.println("Quantidade de poções: " + quantidadePorcao);
            if (quantidadePorcao > 0)
            {
                jogador.setPontosVida(jogador.getPontosVida() + (int) valorpocao);
                quantidadePorcao--;
            }else if (quantidadePorcao <= 0)
            {
                System.out.println("Você não tem mais poções");
            }
        }
    }

    public int getQuantidadePorcao() {
        return quantidadePorcao;
    }

    public void setQuantidadePorcao(int quantidadePorcao) {
        this.quantidadePorcao = quantidadePorcao;
    }
}

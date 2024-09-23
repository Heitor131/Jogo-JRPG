// public class Armadura {
//     private int defesa;

//     public Armadura(int defesa) {
        
//         this.defesa = defesa;
//     }

//     public int getDefesa() {
//         return defesa;
//     }
// }


public class Armadura {
    private int defesa;

    public Armadura(int defesa) {
        this.defesa = defesa; // Exemplo de armadura com 10 de defesa
    }

    public int getDefesa(int constituicao) {
        return defesa + constituicao + ;
    }

    public void mostrarDefesa(Jogador personagem) {
        int defesaTotal = getDefesaTotal(personagem);
        System.out.println("A armadura do personagem é de " + defesaTotal + " pontos.");
    }
}

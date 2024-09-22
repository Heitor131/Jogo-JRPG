import java.util.Random;
import java.util.Scanner;

public class Jogador {
    private String nome;
    private float pontosVida;
    private int[] atributos;
    private String[] nomesAtributos;
    private String[] nomesArmas;
    private String[] nomesArmaduras;
    private int valorTotal;
    private static int D_12 = D12.rolarDado();
    private static int D_4 = D4.rolarDado();




    public Jogador() {
        this.pontosVida = 0;
        this.valorTotal = 15;
        this.atributos = new int[4];
        this.nomesAtributos = new String[]{"Força", "Constituição", "Agilidade", "Destreza"};
        this.nomesArmas = new String[]{"Espada medieval", "Arco e flecha", "Katana", "Adaga"};
        this.nomesArmaduras = new String[]{"Armadura de Ferro", "Armadura de ouro"};
    }

    public int atacar() {
        return Math.max(0, Arma.getDano(this.f)) * this.atributos[0] - Armadura.getDefesa(this);
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
        if (nome == null || nome.trim().length() == 0) {
            System.out.println("Nome inválido. Tente novamente.");
            System.exit(0);
        }
        for (int i = 0; i < nome.length(); i++) {
            if (Character.isDigit(nome.charAt(i))) {
                System.out.println("Nome inválido. Tente novamente.");
                System.exit(0);
            }
        }
        this.nome = nome;
    }

    public float getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(float pontosVida) {
        this.pontosVida = pontosVida;
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

    //public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // CriarPersonagem personagem = new CriarPersonagem();
        

        // System.out.println("#############################################");
        // System.out.println("# Vamos Iniciar a criação do seu personagem #");
        // System.out.println("#-------------------------------------------#");
        // System.out.print("# Informe o nome do seu personagem: ");
        // personagem.setNome(scanner.next());
        // int D_6 = D6.rolarDado();
        // System.out.println("# Pontos de vida:   #");
        // System.out.println("#---------------ATRIBUTOS-------------------#");

        // for (int i = 0; i < 4; i++) {
        //     System.out.println("# " + personagem.getNomesAtributos()[i] + ":                   #");
        // }

        // for (int i = 0; i < 4; i++) {
        //     System.out.println("Valor total disponível: " + personagem.getValorTotal());
        //     System.out.print("Digite o valor para " + personagem.getNomesAtributos()[i] + ": ");
        //     int valor = scanner.nextInt();

        //     // Verifica se o valor inserido é válido
        //     if (valor <= personagem.getValorTotal()) {
        //         personagem.getAtributos()[i] = valor;
        //         personagem.setValorTotal(personagem.getValorTotal() - valor);
        //     } else {
        //         System.out.println("Valor inválido. Tente novamente.");
        //         i--; // Permite que o usuário tente novamente para o mesmo atributo
        //     }
        // }

        // System.out.println("#---------------Armas-----------------------#");
        // for (int e = 0; e < personagem.getNomesArmas().length; e++) {
        //     System.out.println((e + 1) + ". " + personagem.getNomesArmas()[e]);
        // }
        // System.out.print("Selecione a arma (1-4): ");
        // int escolhaArma = scanner.nextInt();
        // String armaEscolhida = personagem.getNomesArmas()[escolhaArma - 1];

        // System.out.println("#---------------Armaduras-------------------#");
        // for (int e = 0; e < personagem.getNomesArmaduras().length; e++) {
        //     System.out.println((e + 1) + ". " + personagem.getNomesArmaduras()[e]);
        // }
        // System.out.print("Selecione a armadura (1-2): ");
        // int escolhaArmadura = scanner.nextInt();
        // String armaduraEscolhida = personagem.getNomesArmaduras()[escolhaArmadura - 1];

        // System.out.println("#############################################");
        // System.out.println("# Personagem Criado com Sucesso             #");
        // System.out.println("#-------------------------------------------#");
        // System.out.println("# Nome do personagem: " + personagem.getNome() + "                #");
        // System.out.println("# Pontos de vida: " + (D_6 + D_6 + D_6 + personagem.getAtributos()[1]) + " #");
        // System.out.println("#---------------ATRIBUTOS-------------------#");
        // System.out.println("# Força: " + personagem.getAtributos()[0] + "                                  #");
        // System.out.println("# Constituição: " + personagem.getAtributos()[1] + "                           #");
        // System.out.println("# Agilidade: " + personagem.getAtributos()[2] + "                              #");
        // System.out.println("# Destreza: " + personagem.getAtributos()[3] + "                               #");
        // System.out.println("#---------------Arma------------------------#");
        // System.out.println("# " + armaEscolhida + "                             #");
        // System.out.println("#---------------Armadura--------------------#");
        // System.out.println("# " + armaduraEscolhida + "                          #");
        // System.out.println("#############################################");

        // scanner.close();

        
    // }


}


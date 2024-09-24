import java.util.Scanner;

public class jogo1 {
    private Jogador jogador;
    private Adversario[] adversarios;

    public jogo1() {
        // Inicializar adversários
        this.jogador = new Jogador();
        this.adversarios = new Adversario[3];
        adversarios[0] = new Adversario("Jack - O Relâmpago", 15, 5, 2, 3);
        adversarios[1] = new Adversario("Billy - O Silencioso", 20, 10, 5, 1);
        adversarios[2] = new Adversario("Tom - O Falcão", 80, 15, 10, 1);
    }

    public void Menu() {
        jogo1 jogo = new jogo1();
        while (true) {
            System.out.println("###########");
            System.out.println("(1) Jogar");
            System.out.println("(2) Historia");
            System.out.println("(3) Creditos");
            System.out.println("(4) Sair");
            System.out.println("###########");
            
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    CriarPersonagem();
                    combate(null, jogador);
                    break;
                case 2:
                    contarHistoria();
                    ClearConsole.clear();
                    break;
                case 3:
                    Creditos();
                    ClearConsole.clear();
                    break;
                case 4:
                    System.out.println("Ate a sua proxima aventura!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private void Creditos() {
        System.out.println("Desenvolvido por: ");
        System.out.println("Heior Parente");
        System.out.println("Andre Buna");
        
    }

    private void contarHistoria() {
        System.out.println("Um pistoleiro chamado " + " está em busca da glória. Simplesmente acordou um dia de sua casa humilde e decidiu se tornar o maior pistoleiro de seu tempo. Então sua atual missao é enfrentar em um duelo os 3 maiores pistoleiros para assim conseguir provar o seu valor. Este é o inicio da sua jornada. Seu primeiro oponente eh o pistoleiro Jack “O Relâmpago” McGraw, dos três o mais fraco.");
    }

    private void CriarPersonagem (){
        Scanner scanner = new Scanner(System.in);
        Jogador personagem = new Jogador();
        

        System.out.println("#############################################");
        System.out.println("# Vamos Iniciar a criação do seu personagem #");
        System.out.println("#-------------------------------------------#");
        System.out.print("# Informe o nome do seu personagem: ");
        personagem.setNome(scanner.next());
        int D_6 = D6.rolarDado();
        System.out.println("# Pontos de vida:   #");
        int vida = (D_6 + D_6 + D_6 + personagem.getAtributos()[1]);
        System.out.println("#---------------ATRIBUTOS-------------------#");

        for (int i = 0; i < 4; i++) {
            System.out.println("# " + personagem.getNomesAtributos()[i] + ":                   #");
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Valor total disponível: " + personagem.getValorTotal());
            System.out.print("Digite o valor para " + personagem.getNomesAtributos()[i] + ": ");
            int valor = scanner.nextInt();

            // Verifica se o valor inserido é válido
            if (valor <= personagem.getValorTotal()) {
                personagem.getAtributos()[i] = valor;
                personagem.setValorTotal(personagem.getValorTotal() - valor);
            } else {
                System.out.println("Valor inválido. Tente novamente.");
                i--; // Permite que o usuário tente novamente para o mesmo atributo
            }
        }

        System.out.println("#---------------Armas-----------------------#");
        for (int e = 0; e < personagem.getNomesArmas().length; e++) {
            System.out.println((e + 1) + ". " + personagem.getNomesArmas()[e]);
        }
        System.out.print("Selecione a arma (1-4): ");
        int escolhaArma = scanner.nextInt();
        String armaEscolhida = personagem.getNomesArmas()[escolhaArma - 1];

        System.out.println("#---------------Armaduras-------------------#");
        for (int e = 0; e < personagem.getNomesArmaduras().length; e++) {
            System.out.println((e + 1) + ". " + personagem.getNomesArmaduras()[e]);
        }
        System.out.print("Selecione a armadura (1-2): ");
        int escolhaArmadura = scanner.nextInt();
        String armaduraEscolhida = personagem.getNomesArmaduras()[escolhaArmadura - 1];

        System.out.println("#############################################");
        System.out.println("# Personagem Criado com Sucesso             #");
        System.out.println("#-------------------------------------------#");
        System.out.println("# Nome do personagem: " + personagem.getNome() + "                #");
        System.out.println("# Pontos de vida: " + vida + " #");
        System.out.println("#---------------ATRIBUTOS-------------------#");
        System.out.println("# Força: " + personagem.getAtributos()[0] + "                                  #");
        System.out.println("# Constituição: " + personagem.getAtributos()[1] + "                           #");
        System.out.println("# Agilidade: " + personagem.getAtributos()[2] + "                              #");
        System.out.println("# Destreza: " + personagem.getAtributos()[3] + "                               #");
        System.out.println("#---------------Arma------------------------#");
        System.out.println("# " + armaEscolhida + "                             #");
        System.out.println("#---------------Armadura--------------------#");
        System.out.println("# " + armaduraEscolhida + "                          #");
        System.out.println("#############################################");

        scanner.close();
    }

    // Removed unused private method Adversario
    public void combate(Adversario adversario, Jogador jogador) {
        Jogador Jogador = new Jogador();
        Adversario Adversario = new Adversario("Jack - O Relâmpago", 15, 5, 2, 3);
        Scanner scanner = new Scanner(System.in);
        jogo1 CriarPersonagem = new jogo1();
        System.out.println("Você entrou em combate contra " + adversario.getNome());
    
        while (true) {
            if (Jogador.estaVivo()) {
                System.out.println("Sua vez de jogar!!");
                System.out.println("Escolha uma ação:");
                System.out.println("(1) Atacar");
                System.out.println("(2) Fugir");
                int escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        int dano = Jogador.atacar();
                        adversario.receberDano(dano);
                        System.out.println("Você atacou " + adversario.getNome() + " com " + dano + " de dano.");
                        break;
                    case 2:
                        System.out.println("Você fugiu do combate.");
                        break;
                }
                
            } else if (adversario.estaVivo()) {
                System.out.println("Você derrotou " + adversario.getNome());
                return;
            }
            if (adversario.estaVivo()) {
                System.out.println("Vez do adiversario atacar!!");
                int danoAdversario = adversario.atacar();
                Jogador.receberDano(danoAdversario);
                System.out.println(adversario.getNome() + " atacou você com " + danoAdversario + " de dano.");

                return;
            } else if (!Jogador.estaVivo()) {
                System.out.println("Você foi derrotado por " + adversario.getNome());
                return;
            }
            // System.out.println("Sua vez de atacar!!");
            // int dano = Jogador.atacar();
            // adversario.receberDano(dano);
            // System.out.println("Você atacou " + adversario.getNome() + " com " + dano + " de dano.");
    
            // if (!adversario.estaVivo()) {
            //     System.out.println("Você derrotou " + adversario.getNome());
            //     return;
            // }
    
            // // Turno do adversário
            // int danoAdversario = adversario.atacar();
            // Jogador.receberDano(danoAdversario);
            // System.out.println(adversario.getNome() + " atacou você com " + danoAdversario + " de dano.");

    
            // if (!Jogador.estaVivo()) {
            //     System.out.println("Você foi derrotado por " + adversario.getNome());
            //     return;
            // }
        }
    }
    
}

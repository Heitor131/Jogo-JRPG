// Arquivo: Jogo.java
import java.util.Scanner;

import ArmaArmadura.Armadura;
import Dados.D6;
import Personagens.Adversario;
import Personagens.*;

public class Combate {  
    private Jogador jogador;
    private Adversario[] adversarios;
    private Scanner scanner;

    public Combate() {
        this.jogador = new Jogador();
        this.adversarios = new Adversario[3];
        adversarios[0] = new Adversario("Jack - O Relâmpago", 25, 10, 2, 3);
        adversarios[1] = new Adversario("Billy - O Silencioso", 30, 15, 5, 3);
        adversarios[2] = new Adversario("Tom - O Falcão", 40, 15, 10, 5);
        this.scanner = new Scanner(System.in);  
    }

    public void menu() {
        while (true) {
            System.out.println("###########");
            System.out.println("(1) Jogar");
            System.out.println("(2) Historia");
            System.out.println("(3) Sair");
            System.out.println("###########");
            
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    criarPersonagem();
                    if (jogador.estaVivo()) combate(adversarios[0], jogador);  // Agora passamos o adversário corretamente
                    if (jogador.estaVivo()) combate(adversarios[1], jogador);
                    if (jogador.estaVivo()) combate(adversarios[2], jogador);
                    break;
                case 2:
                    contarHistoria();
                    ClearConsole.clear();
                    break;
                case 3:
                    System.out.println("Até a sua próxima aventura!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private void creditos() {
        System.out.println("Desenvolvido por: ");
        System.out.println("Heior Parente");
        System.out.println("Andre Buna");
    }

    private void contarHistoria() {
        System.out.println("Um pistoleiro está em busca da glória...");
        System.out.println("Seu primeiro oponente é Jack “O Relâmpago”, dos três o mais fraco.");
    }

    private void criarPersonagem() {
        System.out.println("#############################################");
        System.out.println("# Vamos iniciar a criação do seu personagem #");
        System.out.print("Informe o nome do seu personagem: ");
        jogador.setNome(scanner.next());
        
        // Atribuir pontos de vida
        int D_6 = D6.rolarDado();
        int vida = (D_6 + D_6 + D_6 + jogador.getAtributos()[1]);
        jogador.setPontosVida(vida);
        
        // Distribuir atributos
        System.out.println("#---------------ATRIBUTOS-------------------#");
        for (int i = 0; i < 4; i++) {
            System.out.println("Valor total disponível: " + jogador.getValorTotal());
            System.out.print("Digite o valor para " + jogador.getNomesAtributos()[i] + ": ");
            int valor = scanner.nextInt();

            if (valor <= jogador.getValorTotal()) {
                jogador.getAtributos()[i] = valor;
                jogador.setValorTotal(jogador.getValorTotal() - valor);
            } else {
                System.out.println("Valor inválido. Tente novamente.");
                i--;
            }
        }
        
        // Escolher arma e armadura
        escolherEquipamentos(jogador);
        
        // Exibir status do personagem criado
        exibirStatusPersonagem(jogador);
    }

    private void escolherEquipamentos(Jogador jogador) {
        System.out.println("#---------------Armas-----------------------#");
        for (int e = 0; e < jogador.getNomesArmas().length; e++) {
            System.out.println((e + 1) + ". " + jogador.getNomesArmas()[e]);
        }
        System.out.print("Selecione a arma (1-3): ");
        int escolhaArma = scanner.nextInt();
        String armaEscolhida = jogador.getNomesArmas()[escolhaArma - 1];

        System.out.println("#---------------Armaduras-------------------#");
        for (int e = 0; e < jogador.getNomesArmaduras().length; e++) {
            System.out.println((e + 1) + ". " + jogador.getNomesArmaduras()[e]);
        }
        System.out.print("Selecione a armadura (1-2): ");
        int escolhaArmadura = scanner.nextInt();
        String armaduraEscolhida = jogador.getNomesArmaduras()[escolhaArmadura - 1];
        
        // Configura os equipamentos do jogador
        System.out.println("Arma escolhida: " + armaEscolhida);
        System.out.println("Armadura escolhida: " + armaduraEscolhida);
    }

    private void exibirStatusPersonagem(Jogador jogador) {
        System.out.println("#############################################");
        System.out.println("# Personagem Criado com Sucesso             #");
        System.out.println("Nome: " + jogador.getNome());
        System.out.println("Pontos de vida: " + jogador.getPontosVida());
        System.out.println("Força: " + jogador.getAtributos()[0]);
        System.out.println("Constituição: " + jogador.getAtributos()[1]);
        System.out.println("Agilidade: " + jogador.getAtributos()[2]);
        System.out.println("Destreza: " + jogador.getAtributos()[3]);
        System.out.println("#############################################");
    }

    public void combate(Adversario adversario, Jogador jogador) {
        System.out.println("Você entrou em combate contra " + adversario.getNome());

        while (jogador.estaVivo() && adversario.estaVivo()) {
            if (jogador.getAtributos()[2] > adversario.getAgilidade()) {
                // Turno do jogador
                System.out.println("Você ataca primeiro!");
                System.out.println("Sua vez de atacar!");
                System.out.println("(1) Atacar");
                System.out.println("(2) Fugir");
                int escolha = scanner.nextInt();
                if (escolha == 1) {
                    int dano = jogador.atacar();
                    adversario.receberDano(dano);
                    System.out.println("Você atacou " + adversario.getNome() + " com " + dano + " de dano.");
                } else {
                    System.out.println("Você fugiu do combate.");
                    return ;
                }

                if (!adversario.estaVivo()) {
                    System.out.println("Você derrotou " + adversario.getNome());
                    System.out.println("Voce ganhou 10 de vida");
                    jogador.setPontosVida(jogador.getPontosVida() + 10);
                    System.out.println("Vida atual: " + jogador.getPontosVida());
                    return;
                } 

                // Turno do adversário
                System.out.println("Vez do adversário atacar!");
                int danoAdversario = adversario.atacar();
                jogador.receberDano(danoAdversario);
                System.out.println(adversario.getNome() + " atacou você com " + danoAdversario + " de dano.");

                if (!jogador.estaVivo()) {
                    System.out.println("Você foi derrotado por " + adversario.getNome());
                    return;
                    
                }

            } else {
                System.out.println(adversario.getNome() + " ataca primeiro!");
                // Turno do adversário  
                System.out.println("Vez do adversário atacar!");
                int danoAdversario = adversario.atacar();
                jogador.receberDano(danoAdversario);
                System.out.println(adversario.getNome() + " atacou você com " + danoAdversario + " de dano.");

                if (!jogador.estaVivo()) {
                    System.out.println("Você foi derrotado por " + adversario.getNome());
                    return;
                    
                }
                
                // Turno do jogador
                System.out.println("Sua vez de atacar!");
                System.out.println("(1) Atacar");
                System.out.println("(2) Fugir");
                int escolha = scanner.nextInt();
                if (escolha == 1) {
                    int dano = jogador.atacar();
                    adversario.receberDano(dano);
                    System.out.println("Você atacou " + adversario.getNome() + " com " + dano + " de dano.");
                } else {
                    System.out.println("Você fugiu do combate.");
                    return ;
                }

                if (!adversario.estaVivo()) {
                    System.out.println("Você derrotou " + adversario.getNome());
                    return;
                    
                }
            }
            
        }
        //verifica se o jogador ainda está vivo
        if (!jogador.estaVivo()) {
            System.out.println("Você foi derrotado por " + adversario.getNome());
        } 

        // while (jogador.estaVivo() && adversario.estaVivo()) {
        //     // Se o jogador vencer o adversário, ele pode escolher entre continuar o jogo ou sair
        //     System.out.println("Você derrotou " + adversario.getNome());
        //     System.out.println("Deseja continuar jogando?");
        //     System.out.println("(1) Sim");
        //     System.out.println("(2) Não");
        //     int escolha = scanner.nextInt();
        //     if (escolha == 1) {
        //         combate(adversarios[1], jogador);
        //     } else {
        //         System.out.println("Até a próxima aventura!");
        //         System.exit(0);
        //     }
        // }
    }
}


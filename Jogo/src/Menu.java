import java.util.Scanner;

public class Menu {
    public static void mostrarMenu() {
        System.out.println("###########");
        System.out.println("(1) Jogar");
        System.out.println("(2) Historia");
        System.out.println("(3) Creditos");
        System.out.println("###########");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                Jogar.Fases(null);
                break;
            case 2:
                Historia.Historia_geral(null);
                break;
            case 3:
                Creditos.mostrarCreditos();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        
    }

}

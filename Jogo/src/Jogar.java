import java.util.Scanner;

public class Jogar {
    public static void Fases(String[] args) {
        System.out.println("#############");
        System.out.println("# (1) FASE1 #");
        System.out.println("# (2) FASE2 #");
        System.out.println("# (3) FAZE3 #");
        System.out.println("#############");

        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt(); // Corrigido aqui


        switch (escolha) {
            case 1:
                System.out.println("FASE 1");
                break;
            case 2:
                System.out.println("FASE 2");
                break;
            case 3:
                System.out.println("FASE 3");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}

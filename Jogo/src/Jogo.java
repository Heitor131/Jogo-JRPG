import java.util.Random;
import java.util.Scanner;

public class Jogo{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("██████████████████████████████████████████████████████████████████\n" + //
                        "█▌                                                              ▐█\n" + //
                        "█▌ __      __.__.__       .___  __      __                 __   ▐█\n" + //
                        "█▌/  \\    /  \\__|  |    __| _/ /  \\    /  \\ ____   _______/  |_ ▐█\n" + //
                        "█▌\\   \\/\\/   /  |  |   / __ |  \\   \\/\\/   // __ \\ /  ___/\\   __\\▐█\n" + //
                        "█▌ \\        /|  |  |__/ /_/ |   \\        /\\  ___/ \\___ \\  |  |  ▐█\n" + //
                        "█▌  \\__/\\  / |__|____/\\____ |    \\__/\\  /  \\___  >____  > |__|  ▐█\n" + //
                        "█▌       \\/                \\/         \\/       \\/     \\/        ▐█\n" + //
                        "█▌                                                              ▐█\n" + //
                        "██████████████████████████████████████████████████████████████████");

                        System.out.print(">> Press any key to continue <<");
                        scanner.nextLine();
        
        
        jogo1 jogo = new jogo1();
        jogo.Menu();
        ClearConsole.clear();
        
    }
}

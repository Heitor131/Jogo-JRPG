import java.util.Scanner;

public class Menu{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

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
        
        
        Combate combate = new Combate();
        combate.menu();
        ClearConsole.clear();
        
    }
}

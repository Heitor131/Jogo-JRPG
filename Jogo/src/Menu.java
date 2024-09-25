import java.util.Scanner;

public class Menu{
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("\t\t\t\t\t██████████████████████████████████████████████████████████████████");
        System.out.println("\t\t\t\t\t█▌                                                              ▐█");
        System.out.println("\t\t\t\t\t█▌ __      __.__.__       .___  __      __                 __   ▐█");
        System.out.println("\t\t\t\t\t█▌/  \\    /  \\__|  |    __| _/ /  \\    /  \\ ____   _______/  |_ ▐█");
        System.out.println("\t\t\t\t\t█▌\\   \\/\\/   /  |  |   / __ |  \\   \\/\\/   // __ \\ /  ___/\\   __\\▐█");
        System.out.println("\t\t\t\t\t█▌ \\        /|  |  |__/ /_/ |   \\        /\\  ___/ \\___ \\  |  |  ▐█");
        System.out.println("\t\t\t\t\t█▌  \\__/\\  / |__|____/\\____ |    \\__/\\  /  \\___  >____  > |__|  ▐█");
        System.out.println("\t\t\t\t\t█▌       \\/                \\/         \\/       \\/     \\/        ▐█");
        System.out.println("\t\t\t\t\t█▌                                                              ▐█");
        System.out.println("\t\t\t\t\t██████████████████████████████████████████████████████████████████");
                        System.out.print("\t\t\t\t\t\t\t>> Press any key to continue <<");
                        scanner.nextLine();
        
        ClearConsole.clear();
        Combate combate = new Combate();
        combate.menu();
        ClearConsole.clear();
        
    }
}

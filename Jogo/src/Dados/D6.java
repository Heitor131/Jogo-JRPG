package Dados;
import java.util.Random;

public class D6 {
    public static int rolarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Gera um número entre 1 e 6
    }
}

package Dados;
import java.util.Random;

public class D4 {
    public static int rolarDadoD4() {
        Random random = new Random();
        return random.nextInt(4) + 1; // Gera um número entre 1 e 4
    }
}

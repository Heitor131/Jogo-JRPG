package Dados;
import java.util.Random;

public class D12 {
    public static int rolarDado() {
        Random random = new Random();
        return random.nextInt(12) + 1; // Gera um número entre 1 e 12
    }
}



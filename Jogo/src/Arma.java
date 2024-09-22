import java.util.Random;

public class Arma {
    private String categoria; // "pesada" ou "leve"
    private int constanteDano = 5;

    public Arma(String categoria, int constanteDano) {
        this.categoria = categoria;
        this.constanteDano = constanteDano;
    }

    public int getDano(int forca) {
        Random rand = new Random();
        if (categoria.equals("pesada")) {
            return rand.nextInt(12) + 1 + (int)(1.5 * forca) + constanteDano;
        } else { // leve
            return rand.nextInt(6) + 1 + rand.nextInt(6) + 1 + rand.nextInt(4) + 1 + forca + constanteDano;
        }
    }
}

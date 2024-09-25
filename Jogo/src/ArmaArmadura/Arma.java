package ArmaArmadura;

import java.util.Random;

public class Arma {
    private String categoria; // "pesada" ou "leve"
    private int constanteDano;

    public Arma(String categoria, int constanteDano) {
        this.categoria = categoria;
        this.constanteDano = constanteDano;
    }

    public int getDano(int forca, int destreza) {
        Random rand = new Random();
        if (categoria.equals("pesada")) {
            return rand.nextInt(12) + 1 + (int)(1.5 * forca) + constanteDano;
        } else { // leve
            return rand.nextInt(6) + 1 + rand.nextInt(6) + 1 + rand.nextInt(4) + 1 + destreza + constanteDano;
        }
    }

    public static int calcularDanoArma(String nomeArma, int forca, int destreza) {
        String categoria = "";
        int constanteDano = 0;

        switch (nomeArma) {
            case "Revolver":
                categoria = "leve";
                constanteDano = 5;
                break;
            case "Escopeta":
                categoria = "pesada";
                constanteDano = 8;
                break;
            case "Rifle":
                categoria = "pesada";
                constanteDano = 7;
                break;
            default:
                System.out.println("Arma inválida.");
                return 0; // Retorna 0 se a arma for inválida
        }

        Arma arma = new Arma(categoria, constanteDano);
        return arma.getDano(forca, destreza);
    }
}

import java.util.Random;

public class Arma {
    private String categoria; // "pesada" ou "leve"
    private int constanteDano;

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

    public static int calcularDanoArma(String nomesArmas, int forca) {
        String categoria = "";
        int constanteDano = 0;

        switch (nomesArmas) {
            case "Revolver":
                categoria = "leve";
                constanteDano = 5;
                break;
            case "Escopeta":
                categoria = "pesada"; // "pesada" minúsculo
                constanteDano = 8;
                break;
            case "Rifle":
                categoria = "pesada"; // "pesada" minúsculo
                constanteDano = 7;
                break;
            default:
                System.out.println("Arma inválida.");
                return 0; // Retorna 0 se a arma for inválida
        }

        // Criar instância da arma com a categoria e constante de dano definidos
        Arma arma = new Arma(categoria, constanteDano);

        // Calcular o dano usando a força
        return arma.getDano(forca);
    }
}

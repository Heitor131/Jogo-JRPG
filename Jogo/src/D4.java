import java.util.Random;

public class D4{

public static int rolarDado() {
    Random random = new Random();
    int soma = 0;
    //int constante = 5; // Constante a ser somada ao final

    for (int i = 0; i < 1; i++) {
        int numeroAleatorio = random.nextInt(4) + 1; // Gera um número entre 1 e 6
        //soma = numeroAleatorio + soma; // Adiciona o número gerado à soma
    }

        //soma += constante; // Adiciona a constante à soma total
        return random.nextInt(4) + 1;
    }
}

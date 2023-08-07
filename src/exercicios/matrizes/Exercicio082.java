package exercicios.matrizes;

import java.util.Random;
import java.util.Arrays;

public class Exercicio082 {
    /*public static void main(String[] args) {
        System.out.println("Gera uma matriz 4 x 4 e calcula sua transposta");

        int[][] matriz = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        int[][] transposta = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(transposta[i]));
        }
    }*/

    //

    public static void main(String[] args) {
        System.out.println("Gera uma matriz 4 x 4 e calcula a transposta");

        int[][] matriz = geraMatriz();

        System.out.println("Matriz gerada:");
        exibeMatriz(matriz);

        int[][] transposta = calculaTransposta(matriz);

        System.out.println("Matriz transposta:");
        exibeMatriz(transposta);
    }

    public static int[][] geraMatriz() {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        return matriz;
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    public static int[][] calculaTransposta(int[][] matriz) {
        int[][] transposta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }
}

package exercicios.matrizes;

import java.util.Arrays;
import java.util.Random;

public class Exercicio086 {
    public static void main(String[] args) {
        System.out.println("Calcula a soma dos elementos de cada linha e de cada coluna");

        int[][] matriz = geraMatriz();

        System.out.println("Matriz:");
        exibeMatriz(matriz);

        System.out.println("Soma das linhas:");
        for (int i = 0; i < 4; i++) {
            int soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += matriz[i][j];
            }

            System.out.println("Soma da linha " + (i + 1) + ": " + soma);
        }

        System.out.println("Soma das colunas:");
        for (int i = 0; i < 4; i++) {
            int soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += matriz[j][i];
            }

            System.out.println("Soma da coluna " + (i + 1) + ": " + soma);
        }
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
}

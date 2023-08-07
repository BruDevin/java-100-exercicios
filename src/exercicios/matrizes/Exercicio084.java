package exercicios.matrizes;

import java.util.Arrays;
import java.util.Random;

public class Exercicio084 {
    public static void main(String[] args) {
        System.out.println("Exibe o maior elemento de uma matriz e sua posição");

        int[][] matriz = geraMatriz();

        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i + 1;
                    coluna = j + 1;
                }
            }
        }

        exibeMatriz(matriz);

        System.out.println("Maior elemento: Matriz(" + linha + "," + coluna + ") = " + maior);
    }
    public static int[][] geraMatriz() {
        Random random = new Random();
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }

        return matriz;
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}

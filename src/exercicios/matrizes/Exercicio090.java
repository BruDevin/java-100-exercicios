package exercicios.matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio090 {
    public static void main(String[] args) {
        System.out.println("Recebe uma matriz de campo minado (0s e 1s) e retorna uma matriz com o número de minas " +
                "vizinhas para cada posição");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        System.out.println("Digite os elementos da matriz:");
        int[][] matriz = recebeMatriz(linhas, colunas);

        exibeMatriz(matriz);

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = -1; k <= 1; k++) {
                    for (int l = -1; l <= 1; l++) {
                        if ((i + k) >= 0
                                && (i + k) < linhas
                                && (j + l) >= 0
                                && (j + l) < colunas
                                && !(k == 0 && l == 0)) {
                            resultado[i][j] += matriz[i + k][j + l];
                        }
                    }
                }
            }
        }

        System.out.println("Resultado:");
        exibeMatriz(resultado);
    }

    public static int[][] recebeMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}

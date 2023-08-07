package exercicios.matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio089 {
    public static void main(String[] args) {
        System.out.println("Verifica se uma matriz é diagonal");

        System.out.println("Digite os elementos da matriz 4 x 4:");
        int[][] matriz = recebeMatriz(4, 4);

        System.out.println("Matriz:");
        exibeMatriz(matriz);

        boolean ehDiagonal = true;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if (i != j && matriz[i][j] != 0) {
                    ehDiagonal = false;
                    break;
                }
            }
        }

        if (ehDiagonal) {
            System.out.println("É diagonal.");
        } else {
            System.out.println("Não é diagonal.");
        }
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

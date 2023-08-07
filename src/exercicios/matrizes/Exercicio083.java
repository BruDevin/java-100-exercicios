package exercicios.matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio083 {
    public static void main(String[] args) {
        System.out.println("Calcula a soma de duas matrizes 2 x 2");

        System.out.println("Digite os elementos da primeira matriz:");
        int[][] matriz1 = recebeMatriz();

        System.out.println("Digite os elementos da segunda matriz:");
        int[][] matriz2 = recebeMatriz();

        int[][] soma = somaMatrizes(matriz1, matriz2);

        System.out.println("Matriz 1:");
        exibeMatriz(matriz1);

        System.out.println("Matriz 2:");
        exibeMatriz(matriz2);

        System.out.println("Soma das matrizes:");
        exibeMatriz(soma);
    }

    public static int[][] recebeMatriz() {
        int[][] matriz = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static int[][] somaMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] soma = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                soma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return soma;
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}

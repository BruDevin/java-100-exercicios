package exercicios.matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio088 {
    public static void main(String[] args) {
        System.out.println("Calcula a multiplicação de duas matrizes. Antes, verifica se a multiplicação é possível");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas da primeira matriz: ");
        int linhas1 = scanner.nextInt();
        System.out.print("Digite o número de colunas da primeira matriz: ");
        int colunas1 = scanner.nextInt();
        System.out.print("Digite o número de linhas da segunda matriz: ");
        int linhas2 = scanner.nextInt();
        System.out.print("Digite o número de colunas da segunda matriz: ");
        int colunas2 = scanner.nextInt();

        if(colunas1 != linhas2) {
            System.out.println("Não é possível multiplicar as matrizes.");
            return;
        }

        int[][] matriz1 = new int[linhas1][colunas1];
        int[][] matriz2 = new int[linhas2][colunas2];
        int[][] resultado = new int[linhas1][colunas2];

        System.out.println("Digite os elementos da primeira matriz " + linhas1 + " x " + colunas1);
        matriz1 = recebeMatriz(linhas1, colunas1);

        System.out.println("Digite os elementos da segunda matriz " + linhas2 + " x " + colunas2);
        matriz2 = recebeMatriz(linhas2, colunas2);

        resultado = multiplicaMatrizes(matriz1, matriz2);

        System.out.println("Matriz 1:");
        exibeMatriz(matriz1);

        System.out.println("Matriz 2:");
        exibeMatriz(matriz2);

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

    public static int[][] multiplicaMatrizes(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz2[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}

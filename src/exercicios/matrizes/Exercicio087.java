package exercicios.matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio087 {
    public static void main(String[] args) {
        System.out.println("Calcula o determinante de uma matriz");

        System.out.println("Digite os elementos da matriz 3 x 3");
        int[][] matriz = recebeMatriz();

        System.out.println("Matriz:");
        exibeMatriz(matriz);

        int determinante = (matriz[0][0] * matriz[1][1] * matriz[2][2])
                + (matriz[0][1] * matriz[1][2] * matriz[2][0])
                + (matriz[0][2] * matriz[1][0] * matriz[2][1])
                - (matriz[0][2] * matriz[1][1] * matriz[2][0])
                - (matriz[0][0] * matriz[1][2] * matriz[2][1])
                - (matriz[0][1] * matriz[1][0] * matriz[2][2]);

        System.out.println("Determinante: " + determinante);
    }

    public static int[][] recebeMatriz() {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        return matriz;
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}

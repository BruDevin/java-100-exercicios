package exercicios.matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio085 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int soma = 0;
        int quantidade = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores da matriz 3 x 3:");
        matriz = recebeMatriz();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i + j) % 2 == 0) {
                    soma += matriz[i][j];
                    quantidade++;
                }
            }
        }

        double media = (double) soma / quantidade;

        exibeMatriz(matriz);

        System.out.println("A média do elementos presentes em posições pares é: " + media);

        scanner.close();
    }

    public static int[][] recebeMatriz() {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static void exibeMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}

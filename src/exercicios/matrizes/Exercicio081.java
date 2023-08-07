package exercicios.matrizes;

import java.util.Scanner;

public class Exercicio081 {
    public static void main(String[] args) {
        System.out.println("Calcula a soma dos elementos da diagonal principal de uma matriz");

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3 x 3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matriz[i][i];
        }

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}

package exercicios.vetores;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio079 {
    public static void main(String[] args) {
        System.out.println("Retorna um vetor com o produto dos elementos de dois vetores");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] produto = new int[tamanho];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            produto[i] = vetor1[i] * vetor2[i];
        }

        System.out.println("Vetor produto: " + Arrays.toString(produto));

        scanner.close();
    }
}

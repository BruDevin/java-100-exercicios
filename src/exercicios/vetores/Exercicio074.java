package exercicios.vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio074 {
    public static void main(String[] args) {
        System.out.println("Retorna um vetor com a soma dos elementos de dois vetores");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorSoma = new int[tamanho];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = scanner.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i= 0; i < tamanho; i++) {
            vetor2[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println(Arrays.toString(vetorSoma));

        scanner.close();
    }
}

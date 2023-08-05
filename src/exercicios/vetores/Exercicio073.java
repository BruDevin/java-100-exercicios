package exercicios.vetores;

import java.util.Scanner;

public class Exercicio073 {
    public static void main(String[] args) {
        System.out.println("Retorna a média dos elementos de um vetor");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        int soma =0;
        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }

        double media = (double) soma / tamanho;

        System.out.println("Média: " + media);

        scanner.close();
    }
}

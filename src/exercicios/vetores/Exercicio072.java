package exercicios.vetores;

import java.util.Scanner;

public class Exercicio072 {
    public static void main(String[] args) {
        System.out.println("Exibe o maior elemento de um vetor");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];

        for (int i =1; i < tamanho; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Maior: " + maior);

        scanner.close();
    }
}

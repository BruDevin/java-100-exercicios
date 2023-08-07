package exercicios.vetores;

import java.util.Scanner;

public class Exercicio080 {
    public static void main(String[] args) {
        System.out.println("Verifica se todos os elementos de um vetor são pares");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i= 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        boolean pares = true;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] % 2 != 0) {
                pares = false;
                break;
            }
        }

        if (pares) {
            System.out.println("Todos os elementos são pares.");
        } else {
            System.out.println("Algum elemento é ímpar.");
        }

        scanner.close();
    }
}

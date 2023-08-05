package exercicios.vetores;

import java.util.Scanner;

public class Exercicio075 {
    public static void main(String[] args) {
        System.out.println("Verifica se os elementos de um vetor estão em ordem crescente");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        boolean ordem = true;

        for (int i = 0; i < tamanho - 1; i++) {
            if (vetor[i] > vetor[i+1]) {
                ordem = false;
                break;
            }
        }

        if (ordem) {
            System.out.println("Está em ordem crescente.");
        } else {
            System.out.println("Não está em ordem crescente.");
        }

        scanner.close();
    }
}

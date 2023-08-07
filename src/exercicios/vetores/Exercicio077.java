package exercicios.vetores;

import java.util.Scanner;

public class Exercicio077 {
    public static void main(String[] args) {
        System.out.println("Encontra o segundo maior elemento de um vetor");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        int maior = Integer.MIN_VALUE;
        int segundo = Integer.MIN_VALUE;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > maior) {
                segundo = maior;
                maior = vetor[i];
            } else if (vetor[i] > segundo) {
                segundo = vetor[i];
            }
        }

        System.out.println("Segundo maior: " + segundo);

        scanner.close();
    }
}

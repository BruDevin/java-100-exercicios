package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio098 {
    public static void main(String[] args) {
        System.out.println("Encontra o menor valor em um vetor");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        int menor = encontraMenor(vetor);

        System.out.println("Menor elemento: " + menor);

        scanner.close();
    }

    public static int encontraMenor (int[] vetor) {
        return encontraMenorRecursivo(vetor, 0, vetor.length - 1);
    }

    public static int encontraMenorRecursivo (int[] vetor, int inicio, int fim) {
        if (inicio == fim) {
            return vetor[inicio];
        } else {
            int meio = (inicio + fim) / 2;
            int menorEsquerda = encontraMenorRecursivo(vetor, inicio, meio);
            int menorDireita = encontraMenorRecursivo(vetor, meio + 1, fim);
            return Math.min(menorDireita, menorEsquerda);
        }
    }
}

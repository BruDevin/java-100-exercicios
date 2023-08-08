package exercicios.extras;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        System.out.println("Digite os elementos do vetor:");
        int[] vetor = recebeVetor(tamanho);

        System.out.println("Vetor original: " + Arrays.toString(vetor));

        bubbleSort(vetor);

        System.out.println("Vetor ordenado com bubbleSort: " + Arrays.toString(vetor));

        scanner.close();
    }

    public static int[] recebeVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        return vetor;
    }

    public static void bubbleSort(int[] array) {
        int tamanho = array.length;

        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 -i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

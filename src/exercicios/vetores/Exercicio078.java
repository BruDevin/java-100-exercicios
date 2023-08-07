package exercicios.vetores;

import java.util.Scanner;

public class Exercicio078 {
    public static void main(String[] args) {
        System.out.println("Verifica quantas vezes determinado elemento se repete em um vetor");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Digite o elemento a ser buscado: ");
        int alvo = scanner.nextInt();

        int contador = 0;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == alvo) {
                contador++;
            }
        }

        System.out.println("Repetições: " + contador);

        scanner.close();
    }
}

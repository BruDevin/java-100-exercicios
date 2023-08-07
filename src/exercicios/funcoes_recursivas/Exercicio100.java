package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio100 {
    public static void main(String[] args) {
        System.out.println("Calcula a soma dos elementos de um vetor");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        int soma = calculasoma(vetor);

        System.out.println("Soma: " + soma);

        scanner.close();
    }

    public static int calculasoma(int[] vetor) {
        if (vetor.length == 0) {
            return 0;
        } else {
            return calculaSomaRecursiva(vetor, vetor.length - 1);
        }
    }

    public static int calculaSomaRecursiva(int[] vetor, int indice) {
        if (indice < 0) {
            return 0;
        } else {
            return vetor[indice] + calculaSomaRecursiva(vetor, indice - 1);
        }
    }
}

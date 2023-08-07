package exercicios.vetores;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio076 {
    /*public static void main(String[] args) {
        System.out.println("Inverte a ordem dos elementos de um vetor");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Ordem inversa: ");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        scanner.close();
    }*/

    //

    public static void main(String[] args) {
        System.out.println("Inverte a ordem dos elementos de um vetor");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor.add(scanner.nextInt());
        }

        Collections.reverse(vetor);

        System.out.println("Ordem inversa: " + vetor);

        scanner.close();
    }
}

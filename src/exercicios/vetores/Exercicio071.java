package exercicios.vetores;

import java.util.Scanner;

import java.util.ArrayList;

public class Exercicio071 {
    public static void main(String[] args) {
        System.out.println("Soma todos os elementos de um vetor");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        /*int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor: ");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;

        for (int i = 0; i < tamanho; i++) {
            soma += vetor[i];
        }*/

        //

        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite os elementos da lista: ");
        for (int i = 0; i < tamanho; i++) {
            lista.add(scanner.nextInt());
        }

        int soma = 0;

        for (int numero : lista) {
            soma += numero;
        }

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}

package exercicios.loops;

import java.util.Scanner;

public class Exercicio052 {
    public static void main(String[] args) {
        System.out.println("Soma todos os números de 1 a n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= num; i++) {
            soma += i;
        }

        System.out.println("A soma de todos os números de 1 a " + num + " é " + soma + ".");

        scanner.close();
    }
}

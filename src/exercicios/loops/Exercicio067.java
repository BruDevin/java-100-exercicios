package exercicios.loops;

import java.util.Scanner;

public class Exercicio067 {
    public static void main(String[] args) {
        System.out.println("Exibe os divisores de um número");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println("Divisores:");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

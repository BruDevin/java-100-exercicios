package exercicios.loops;

import java.util.Scanner;

public class Exercicio059 {
    public static void main(String[] args) {
        System.out.println("Exibe todos os números entre \"a\" e \"b\"");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        if (b > a) {
            for (int i = a + 1; i < b; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a - 1; i > b; i--) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

package exercicios.loops;

import java.util.Scanner;

public class Exercicio069 {
    public static void main(String[] args) {
        System.out.println("MDC");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int menor = Math.min(num1, num2);
        int mdc = 1;

        for (int i = 2; i <= menor; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                mdc = i;
            }
        }

        System.out.println("MDC: " + mdc);

        scanner.close();
    }
}

package exercicios.funcoes_recursivas;

import java.util.Scanner;

public class Exercicio096 {
    public static void main(String[] args) {
        System.out.println("MDC");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int mdc = calculaMDC (num1, num2);

        System.out.println("MDC: " + mdc);

        scanner.close();
    }

    public static int calculaMDC (int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return calculaMDC (num2, num1 % num2);
        }
    }
}

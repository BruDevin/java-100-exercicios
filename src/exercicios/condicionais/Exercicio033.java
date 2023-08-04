package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio033 {
    public static void main(String[] args) {
        System.out.println("Verfica se a soma de três números é divisível por 5");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;

        if (soma % 5 == 0) {
            System.out.println("A soma é divisível por 5.");
        } else {
            System.out.println("A soma não é divisível por 5.");
        }

        scanner.close();
    }
}

package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio035 {
    public static void main(String[] args) {
        System.out.println("Coloca três números em ordem crescente");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        if (num1 <= num2 && num1 <= num3) {
            System.out.print(num1 + " ");
            if (num2<= num3) {
                System.out.print(num2 + " " + num3);
            } else {
                System.out.print(num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.print(num2 + " ");
            if (num1 <= num3) {
                System.out.print(num1 + " " + num3);
            } else {
                System.out.print(num3 + " " + num1);
            }
        } else {
            System.out.print(num3 + " ");
            if (num1 <= num2) {
                System.out.print(num1 + " " + num2);
            } else {
                System.out.print(num2 + " " + num1);
            }
        }

        scanner.close();
    }
}

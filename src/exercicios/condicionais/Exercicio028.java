package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio028 {
    public static void main(String[] args) {
        System.out.println("Verifica o maior entre três números");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }

        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número informado é: " + maior + ".");

        scanner.close();
    }
}

package exercicios.matematica;

import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
        System.out.println("Delta de uma equação do 2º grau");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("O delta da equação é: " + delta);

        scanner.close();
    }
}

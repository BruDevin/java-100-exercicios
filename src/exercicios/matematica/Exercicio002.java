package exercicios.matematica;

import java.util.Scanner;

public class Exercicio002 {
    public static void main(String[] args) {
        System.out.println("Média aritmética de dois números");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        double media = (numero1 + numero2) / 2;

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}

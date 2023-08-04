package exercicios.matematica;

import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        System.out.println("Perímetro de um círculo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double perimetro = 2 * Math.PI * raio;

        System.out.println("O perímetro do círculo é: " + perimetro);

        scanner.close();
    }
}

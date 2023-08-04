package exercicios.matematica;

import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        System.out.println("Área de um círculo");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}

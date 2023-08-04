package exercicios.matematica;

import java.util.Scanner;

public class Exercicio014 {
    public static void main(String[] args) {
        System.out.println("Distância entre dois pontos");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto: ");
        System.out.print("Coordenada x: ");
        double x1 = scanner.nextDouble();
        System.out.print("Coordenada y: ");
        double y1 = scanner.nextDouble();

        System.out.println("Digite as coordenadas do segundo ponto: ");
        System.out.print("Coordenada x: ");
        double x2 = scanner.nextDouble();
        System.out.print("Coordenada y: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("\nA distância entre os pontos é: " + distancia);

        scanner.close();
    }
}

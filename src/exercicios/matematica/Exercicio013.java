package exercicios.matematica;

import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        System.out.println("Trabalho realizado por uma força sobre um objeto");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a força aplicada: ");
        double forca = scanner.nextDouble();

        System.out.print("Digite a distância percorrida: ");
        double distancia = scanner.nextDouble();

        double trabalho = forca * distancia;

        System.out.println("O trabalho realizado é: " + trabalho);

        scanner.close();
    }
}

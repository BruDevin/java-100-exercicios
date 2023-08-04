package exercicios.matematica;

import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args) {
        System.out.println("Velocidade cinética");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a massa do objeto: ");
        double massa = scanner.nextDouble();

        System.out.print("Digite a velocidade do objeto: ");
        double velocidade = scanner.nextDouble();

        double energiaCinetica = massa * Math.pow(velocidade, 2) / 2;

        System.out.println("A energia cinética do objeto é: " + energiaCinetica);

        scanner.close();
    }
}

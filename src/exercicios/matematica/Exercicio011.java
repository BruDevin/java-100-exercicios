package exercicios.matematica;

import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        System.out.println("Velocidade média");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a variação de espaço (Δs): ");
        double variacaoEspaco = scanner.nextDouble();

        System.out.print("Digite a variação de tempo (Δt): ");
        double variacaoTempo = scanner.nextDouble();

        double velocidadeMedia = variacaoEspaco / variacaoTempo;

        System.out.println("A velocidade média é: " + velocidadeMedia);

        scanner.close();
    }
}

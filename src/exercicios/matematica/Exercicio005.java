package exercicios.matematica;

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
        System.out.println("IMC = peso / altura²");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.println("O IMC é: " + imc);

        scanner.close();
    }
}

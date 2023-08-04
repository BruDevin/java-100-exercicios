package exercicios.matematica;

import java.util.Scanner;

public class Exercicio003 {
    public static void main(String[] args) {
        System.out.println("Média aritmética de três notas");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas e: " + media);

        scanner.close();
    }



}

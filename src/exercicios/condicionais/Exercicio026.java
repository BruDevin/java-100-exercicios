package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio026 {
    public static void main(String[] args) {
        System.out.println("Verifica se uma pessoa é maior de idade");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        double idade = scanner.nextDouble();

        if (idade < 18) {
            System.out.println("Menor de idade.");
        } else {
            System.out.println("Maior de idade.");
        }

        scanner.close();
    }
}

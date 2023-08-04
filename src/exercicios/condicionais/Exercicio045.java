package exercicios.condicionais;

import java.util.Scanner;

public class Exercicio045 {
    public static void main(String[] args) {
        System.out.println("Verifica se um número é divisível pelo outro");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (dividendo): ");
        Double dividendo = scanner.nextDouble();

        System.out.print("Digite o segundo número (divisor): ");
        Double divisor = scanner.nextDouble();

        if (dividendo % divisor == 0) {
            System.out.println(dividendo + " é divisível por " + divisor + ".");
        } else {
            System.out.println(dividendo + " não é divisível por " + divisor + ".");
        }

        scanner.close();
    }
}
